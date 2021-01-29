package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoneyFlowPage {

    @FindBy(xpath = "//span[contains(text(),'Движение денег')]")
    WebElement moneyFlowTab;

    @FindBy(id = "#selectedConsultancyField")
    WebElement moneyFlowTableConsultancy;

    @FindBy(id = "#beginDateField")
    WebElement moneyFlowTableStartDate;

    @FindBy(id = "#endDateField")
    WebElement moneyFlowTableEndDate;

    @FindBy(xpath = "//button[contains(text(),'Make report')]")
    WebElement makeReportButton;
}
