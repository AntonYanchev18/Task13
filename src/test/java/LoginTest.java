import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

import static org.testng.AssertJUnit.*;

public class LoginTest extends MainDriver {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        loginPage.clickLoginButton1();
        ProductPage productPage = new ProductPage(driver);

        assertEquals(productPage.getPageTitle(), "Products");
    }

    @Test
    public void testUnsuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("");
        loginPage.setPassword("secret_sauce");

        loginPage.clickLoginButton1();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void testRemoveAddedItem() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        loginPage.clickLoginButton1();
        ProductPage productPage = new ProductPage(driver);

        assertEquals(productPage.getPageTitle(), "Products");
        productPage.bikeLightAdd();

        productPage.clickProductCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickRemoveButton();

        assertFalse(checkoutPage.isItemAdded());



    }


}




