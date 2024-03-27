package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(css = ".cart_button")
    private List<WebElement> listOfRemoveButtons;

    @FindBy(css = ".cart_button")
    private WebElement removeButtonOneElement;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickRemoveButton() {
        removeButtonOneElement.click();
        return new CheckoutPage(driver);
    }

    public boolean isItemAdded() {
        if (listOfRemoveButtons.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

}
