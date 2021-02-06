package utils;

import configurations.Configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static void generateProperties() throws IOException {
        ConfigurationReader r = new ConfigurationReader();
        r.readPropertiesFile("automation.properties");
    }

    public void  readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream("automation.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }

        Configurations.testEnvironment = prop.getProperty("testEnvironment");
    }

}

