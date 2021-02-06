import Page.*;
import base.BaseTest;
import org.junit.Test;

import java.io.IOException;

public class BuyProduct extends BaseTest {

    @Test
    public void testCase01() throws IOException {
        page.createPageInstance(HomePage.class).selectLogin();
        page.createPageInstance(HomePage.class).goToLoginPage();
        page.createPageInstance(LoginPage.class).checkLoginPage();
        page.createPageInstance(LoginPage.class).enterPasswordAndUsername();
        page.createPageInstance(MainPage.class).search();
        page.createPageInstance(ShopPage.class).goToSecondPage();
        page.createPageInstance(ShopPage.class).checkSecondPage();
        page.createPageInstance(ShopPage.class).selectProduct();
        page.createPageInstance(ProductPage.class).ProductInfo();
        page.createPageInstance(ProductPage.class).buyProduct();
        page.createPageInstance(BasketPage.class).checkPrice();
        page.createPageInstance(BasketPage.class).checkProductsAmount();
        page.createPageInstance(BasketPage.class).increaseProducts();
        page.createPageInstance(BasketPage.class).deleteProductBtn();
        page.createPageInstance(BasketPage.class).checkEmptyMessage();

    }



}
