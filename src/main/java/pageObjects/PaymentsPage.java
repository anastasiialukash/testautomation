package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage {

    @FindBy(xpath = "//span[contains(text(),'Платежи')]")
    WebElement paymentsTab;

    @FindBy(xpath = "//div[contains(text(),'Payment Id')]")
    WebElement paymentsTablePaymentID;

    @FindBy(xpath = "//div[contains(text(),'Invoice Id')]")
    WebElement paymentsTableInvoiceID;

    @FindBy(xpath = "//div[contains(text(),'Payment Date')]")
    WebElement paymentsTablePaymentDate;

    @FindBy(xpath = "//div[contains(text(),'Payment Sum')]")
    WebElement paymentsTablePaymentSum;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement searchPayment;
}
