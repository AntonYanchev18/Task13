package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class ProductPage extends BasePage {
    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLightProduct;

    @FindBy(className = "shopping_cart_badge")
    private WebElement goToCheckout;

    public ProductPage (WebDriver driver) {
        super(driver);
    }
    public String getPageTitle() {
        return pageTitle.getText();
    }

    public ProductPage bikeLightAdd () {
        bikeLightProduct.click();
        return new ProductPage(driver);
    }

    public void clickProductCart() {
        goToCheckout.click();
    }
}
