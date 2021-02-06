package Page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static By loginOrCreateAccount= By.id("");
    private static By goToLoginBtn =By.id("LoginBtn");


    public void selectLogin(){
        clickElement(loginOrCreateAccount);

    }
    public void goToLoginPage(){
        clickElement(goToLoginBtn);
    }
}
