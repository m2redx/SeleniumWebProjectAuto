package Page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static By productName = By.id("sp-title");
    public String productNames=  driver.findElement(By.id("sp-title")).getText();
    public String productPrices = driver.findElement(By.id("sp-price-highPrice")).getText();
    private static By productPrice= By.id("sp-price-highPrice");
    private static By addToBasketBtn= By.id("add-to-basket");
    private static By goToBasket= By.className("class=\"basket-container robot-header-iconContainer-cart");


    public void ProductInfo() throws IOException {
          writeTxt(productNames,productPrices);
    }

    public void buyProduct(){
        clickElement(addToBasketBtn);
        clickElement(goToBasket);
    }


}
