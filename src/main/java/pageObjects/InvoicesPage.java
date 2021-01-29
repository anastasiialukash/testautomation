package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesPage {

    @FindBy(xpath = "//span[contains(text(),'Счета')]")
    WebElement invoicesTab;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[9]/ul[1]/li[1]/a[1]")
    WebElement allInvoices;

    @FindBy(xpath = "//div[contains(text(),'Id')]")
    WebElement allInvoicesTableID;

    @FindBy(xpath = "//div[contains(text(),'Client')]")
    WebElement allInvoicesTableClient;

    @FindBy(xpath = "//div[contains(text(),'Contact ID')]")
    WebElement allInvoicesTableContractID;

    @FindBy(xpath = "//div[contains(text(),'Payment amount')]")
    WebElement allInvoicesTablePaymentAmount;

    @FindBy(xpath = "//div[contains(text(),'Payment date')]")
    WebElement allInvoicesTablePaymentDate;

    @FindBy(xpath = "//div[contains(text(),'Payment status')]")
    WebElement allInvoicesTablePaymentStatus;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchAllInvoices;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement refreshAllInvoicesButton;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[9]/ul[1]/li[2]/a[1]")
    WebElement issueInvoice;

    @FindBy(xpath = "//div[contains(text(),'Client')]")
    WebElement issueInvoiceTableClient;

    @FindBy(xpath = "//div[contains(text(),'Consultancy')]")
    WebElement issueInvoiceTableConsultancy;

    @FindBy(xpath = "//div[contains(text(),'Payment from')]")
    WebElement issueInvoiceTablePaymentFrom;

    @FindBy(xpath = "//div[contains(text(),'Payment to')]")
    WebElement issueInvoiceTablePaymentTo;

    @FindBy(xpath = "//div[contains(text(),'Payment type')]")
    WebElement issueInvoiceTablePaymentType;

    @FindBy(xpath = "//div[contains(text(),'Sum')]")
    WebElement issueInvoiceTablePaymentSum;

    @FindBy(xpath = "//div[contains(text(),'Create Invoice')]")
    WebElement issueInvoiceTableCreateInvoice;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/form[1]/button[1]")
    WebElement createInvoiceButton;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement searchInvoice;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[9]/ul[1]/li[3]/a[1]")
    WebElement debts;

    @FindBy(xpath = "//div[contains(text(),'Student')]")
    WebElement debtsTableStudent;

    @FindBy(xpath = "//div[contains(text(),'Payment date')]")
    WebElement debtsTablePaymentDate;

    @FindBy(xpath = "//div[contains(text(),'Amount of debt')]")
    WebElement debtsTableAmount;

    @FindBy(xpath = "//div[contains(text(),'PaymentType')]")
    WebElement debtsTablePaymentType;

    @FindBy(xpath = "//div[contains(text(),'Employee')]")
    WebElement debtsTableEmployee;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchDebt;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement refreshDebtTableButton;
}
