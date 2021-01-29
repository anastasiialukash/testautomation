package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage {

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement dashboardTab;

    @FindBy(xpath = "//span[contains(text(),'Сделки')]")
    WebElement businessDealsTab;

    @FindBy(xpath = "//span[contains(text(),'Очередь')]")
    WebElement queueTab;

    @FindBy(xpath = "//span[contains(text(),'Клиенты')]")
    WebElement clientsTab;

    @FindBy(xpath = "//span[contains(text(),'Менторы')]")
    WebElement mentorsTab;

    @FindBy(xpath = "//span[contains(text(),'Договора')]")
    WebElement contractsTab;

    @FindBy(xpath = "//span[contains(text(),'Услуги')]")
    WebElement servicesTab;

    @FindBy(xpath = "//span[contains(text(),'Счета')]")
    WebElement invoicesTab;

    @FindBy(xpath = "//span[contains(text(),'Зарплаты')]")
    WebElement salaryTab;

    @FindBy(xpath = "//span[contains(text(),'Платежи')]")
    WebElement paymentsTab;

    @FindBy(xpath = "//span[contains(text(),'Пользователи')]")
    WebElement usersTab;

    @FindBy(xpath = "//span[contains(text(),'Движение денег')]")
    WebElement moneyFlowTab;
}
