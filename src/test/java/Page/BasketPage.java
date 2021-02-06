package Page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public String priceSpan = driver.findElement(By.className("gg-d-8 detail-price")).getText();
    private static By increaseProduct = By.className("plus icon-plus gg-icon gg-icon-plus");
    private static By productControl = By.xpath("//*[@id=\"cart-item-456507143\"]/div[2]/div[4]/div/input");
    private static By deleteProductBtn= By.className("gg-icon gg-icon-bin-medium");
    private static By emptyText= By.xpath("//h2[contains(text(),'Sepetinizde ürün bulunmamaktadır.')]") ;
    WebElement element = driver.findElement(emptyText);



    public  void checkPrice(){
        String text= "input[class='gg-d-8 detail-price']";
        Assert.assertEquals(text,price);

    }


    public void increaseProducts(){
        clickElement(increaseProduct);

    }

    public void checkProductsAmount(){
        String value= "input[class='amount']";
        String value2= driver.findElement(By.cssSelector(value)).getAttribute("value");
        Assert.assertEquals(value2,"2");
    }


    public void deleteProductBtn(){

        clickElement(deleteProductBtn);
    }

    public void checkEmptyMessage(){
        try{
            wait.until(ExpectedConditions.visibilityOf(element));

        }catch (TimeoutException e) {
            throw new IllegalStateException("Sepette hala ürün mevcut");
        }
    }


}
