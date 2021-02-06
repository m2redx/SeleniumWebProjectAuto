package Page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage {
    public ShopPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    private static By firstProduct= By.id("firstProduct");
    private static By secondTag= By.id("SecondTag");


    public void selectProduct() {
        clickElement(firstProduct);
    }

    public void goToSecondPage(){
        clickElement(secondTag);
    }

    public void checkSecondPage(){
      checkPage(secondTag);
    }
}
