package driver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    public abstract void startDriver();
    public abstract void quitDriver();
    public abstract void setCapabilities();
    public abstract WebDriver initializerDriver();

}
