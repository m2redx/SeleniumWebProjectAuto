package Page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static By searchBar = By.id("searchBar");
    private static By searchBtn= By.id("SearchBtn");


    public void search(){
        writeText(searchBar,"bilgisayar");
        clickElement(searchBtn);
    }
}
