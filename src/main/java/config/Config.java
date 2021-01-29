package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public String readPropertyFile(String parameterName, String fileName) {
        Properties property = new Properties();
        try {
            InputStream properties = getClass().getClassLoader().getResourceAsStream(fileName);
            property.load(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property.getProperty(parameterName);
    }
}
