package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.FileWriter;
import java.io.IOException;


public class BasePage extends Base {
    private Logger log = Logger.getLogger(BasePage.class);
    public static String price;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);


    }
    public  boolean isDisplayed(By element){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            log.info(String.format("********** Görüntülendi**********"));
            return true;
        }catch (Exception a){
            log.info(String.format("********** Görüntülenemedi**********"));
            return false;
        }
    }

    public  void clickElement(By element){
        boolean isDisplayed= isDisplayed(element);
                if(isDisplayed){
                    driver.findElement(element).click();
                }
                else {
                    log.info(String.format("********** Tıklama anında bir hata oluştu **********"));
                }
    }

    public void writeText(By element,String text){

        boolean isDisplayed= isDisplayed(element);
        if(isDisplayed){
            driver.findElement(element).sendKeys(text);
        }
        else {
            log.info(String.format("********** Yazamadım**********"));
        }
    }


    public boolean checkPage(By element){
        if (element.getClass().toString()=="current"){
            log.info(String.format("********** Doğru Sayfadasın **********"));
            return true;
        }
        else {
            log.info(String.format("********** Yanlış Sayfadasın **********"));
            return false;
        }
    }

    public static void writeTxt(String productName, String productPrice) throws IOException {

        FileWriter myWriter = new FileWriter("filetxt.txt");
        myWriter.write(productName);
        myWriter.write(productPrice);
         price= productPrice;
        myWriter.close();


    }

}
