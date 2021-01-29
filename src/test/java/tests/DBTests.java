package tests;

import config.Config;
import dataBase.DataBase;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBTests {

    DataBase dataBase = new DataBase();
    Config properties = new Config();

    @Test
    public void randomDeal() {
        String result = dataBase.queryResult(properties.readPropertyFile("randomDeal", "query.properties"));
        System.out.println(result);
    }

    @Test
    public void randomEmployee() {
        String result = dataBase.queryResult(properties.readPropertyFile("randomEmployee", "query.properties"));
        System.out.println(result);
    }

    @Test
    public void randomClient() {
        String result = dataBase.queryResult(properties.readPropertyFile("randomClient", "query.properties"));
        System.out.println(result);
    }

    @Test
    public void resultToList() throws SQLException {
        List<String> result = dataBase.resultSetToList(properties.readPropertyFile("clientsList", "query.properties"), "client");
        System.out.println(result);
    }

    @Test
    public void resultToMap() throws SQLException {
        Map<String, String> result = dataBase.resultSetToMap(properties.readPropertyFile("clientsMap", "query.properties"), "client", "status");
        System.out.println(result);
    }
}
