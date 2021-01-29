package dataBase;

import config.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {

    private final Config properties = new Config();
    public Connection connection;

    public DataBase() {
        this.connection = jDbConnection();
    }

    private final String DRIVER_CLASS = properties.readPropertyFile("driverClass", "config.properties");
    private final String DB_URL = properties.readPropertyFile("dbUrl", "config.properties");
    private final String DB_USER = properties.readPropertyFile("dbUser", "config.properties");
    private final String DB_PASSWORD = properties.readPropertyFile("dbPassword", "config.properties");

    public Connection jDbConnection() {

        System.out.println("Create jdbc connection");

        Connection dbConnection;
        try {
            Class.forName(DRIVER_CLASS);
            dbConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            if (dbConnection != null) {
                System.out.println("Connection created successfully");
            } else {
                System.out.println("Unable to create connection");
            }
            return dbConnection;

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String queryResult(String SQLQuery) {
        StringBuilder builder = new StringBuilder();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQLQuery);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    builder.append(metadata.getColumnName(i)).append(": ");
                    builder.append(rs.getString(i));
                    builder.append("\n");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return builder.toString();
    }

    public List<String> resultSetToList(String SQLQuery, String columnName) throws SQLException {
        Statement statement = connection.createStatement();
        List<String> data = new ArrayList<>();
        ResultSet rs = statement.executeQuery(SQLQuery);
        while (rs.next()) {
            data.add(rs.getString(columnName));
        }
        return data;
    }


    public Map<String, String> resultSetToMap(String SQLQuery, String columnOne, String columnTwo) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SQLQuery);
        Map<String, String> map = new HashMap<>();
        while (rs.next()) {
            map.put(rs.getString(columnOne), rs.getString(columnTwo));
        }
        return map;
    }
}
