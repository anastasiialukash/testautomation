package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {

    @FindBy(xpath = "//span[contains(text(),'Пользователи')]")
    WebElement usersTab;

    @FindBy(xpath = "//div[contains(text(),'UserName')]")
    WebElement usersTableUserName;

    @FindBy(xpath = "//div[contains(text(),'Enabled')]")
    WebElement usersTableEnabled;

    @FindBy(xpath = "//div[contains(text(),'Roles')]")
    WebElement usersTableRoles;

    @FindBy(xpath = "//button[contains(text(),'Add new User')]")
    WebElement addNewUserButton;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[3]/input[1]")
    WebElement searchUser;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement refreshUsersButton;
}
