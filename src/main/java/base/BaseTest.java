package base;

import configurations.Configurations;
import driver.DriverManager;
import driver.DriverManagerFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigurationReader;

import java.io.IOException;


public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    public  static Base page;
    private Logger log = Logger.getLogger(BaseTest.class);

    DriverManager driverManager;


    @Before
    public void initialize(){

        wait= new WebDriverWait(driver, 20);
        page= new Base(driver,wait);
        driverManager= DriverManagerFactory.getDriver(Configurations.driverTypes);
        driver= driverManager.initializerDriver();
        driverManager.quitDriver();
        try {
            ConfigurationReader.generateProperties();

        }catch (IOException configRead){
            configRead.printStackTrace();
        }

    }
    @Before
    public  void startSce(){
        log.info(String.format("********** SENARYO BAŞLADI **********"));
    }

    @After
    public  void  end(){
        log.info(String.format("********** SENARYO BİTTİ **********"));

    }


}
