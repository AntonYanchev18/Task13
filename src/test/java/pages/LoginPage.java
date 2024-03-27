package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = ".error-message-container")
    private WebElement errorMessage;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void setUsername (String username) {
        usernameInput.sendKeys(username);
    }

    public void setPassword (String password) {
        passwordInput.sendKeys(password);
    }

    public ProductPage clickLoginButton () {
        loginButton.click();
        return new ProductPage(driver);
    }

    public LoginPage clickLoginButton1 () {
        loginButton.click();
        return new LoginPage(driver);
    }

    public String getErrorMessage () {
       return errorMessage.getText();

    }

}
