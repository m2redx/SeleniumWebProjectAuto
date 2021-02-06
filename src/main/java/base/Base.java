package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public WebDriver driver;
    public WebDriverWait wait;


    public Base(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;

    }
    public  <Tpage extends BasePage> Tpage createPageInstance(Class<Tpage>page){
        try {
            return page.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver,this.wait);
        }catch (Exception a){
            a.printStackTrace();
            return null;
        }

    }
}
