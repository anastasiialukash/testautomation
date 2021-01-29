package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registrationTab;

    @FindBy(xpath = "//input[@id='register-username']")
    WebElement userNameFieldRegister;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailFieldRegister;

    @FindBy(xpath = "//input[@id='register-password']")
    WebElement passwordFieldRegister;

    @FindBy(xpath = "//input[@id='register-submit']")
    WebElement buttonRegister;
}
