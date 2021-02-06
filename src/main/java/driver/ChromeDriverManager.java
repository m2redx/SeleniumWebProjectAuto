package driver;

import configurations.Configurations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

 class ChromeDriverManager extends  DriverManager{
    WebDriver driver;
    WebDriverWait wait;
    ChromeOptions options;

    @Override
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", Configurations.chromeDriverPath);
        setCapabilities();
        driver= new ChromeDriver(options);

    }

    @Override
    public void quitDriver() {
        if (driver!=null){
            driver.quit();
        }
    }

    @Override
    public void setCapabilities() {

        options= new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("headless");


    }

    @Override
    public WebDriver initializerDriver() {
        startDriver();
        return driver;
    }
}
