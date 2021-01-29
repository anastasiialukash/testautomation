package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginTab;

    @FindBy(xpath = "//input[@id='username']")
    WebElement userNameFieldLogin;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordFieldLogin;

    @FindBy(xpath = "//input[@id='login-submit']")
    WebElement loginButton;

    public void login() {
        userNameFieldLogin.sendKeys("null");
        passwordFieldLogin.sendKeys("null");
        loginButton.click();
    }
}
