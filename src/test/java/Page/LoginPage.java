package Page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private static By loginBtn = By.id("loginBtn");
    private static By priceSpan= By.id("priceSpan");
    private static By loginPageSpan = By.id("loginSpn");
    private static By usernameTextBox= By.id("textBoxUsername");
    private static By passwordTextBox= By.id("testBoxPassword");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public LoginPage clickLoginButton(){
        clickElement(loginBtn);
        return this;
    }



    public  void checkLoginPage(){


        isDisplayed(loginBtn);
    }
    public void enterPasswordAndUsername(){
        writeText(usernameTextBox,"muratmertkirmizi@gmail.com");
        writeText(passwordTextBox,"19981998");
        clickElement(loginBtn);
    }
}
