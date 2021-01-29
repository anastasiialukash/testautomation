package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractsPage {

    @FindBy(xpath = "//span[contains(text(),'Договора')]")
    WebElement contractsTab;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")
    WebElement allContracts;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]")
    WebElement testContracts;

    @FindBy(xpath = "//thead/tr[1]/th[1]/div[1]")
    WebElement allContractsTableContractNumber;

    @FindBy(xpath = "//div[contains(text(),'Client')]")
    WebElement allContractsTableClient;

    @FindBy(xpath = "//div[contains(text(),'Consultancy')]")
    WebElement allContractsTableConsultancy;

    @FindBy(xpath = "//div[contains(text(),'Mentor')]")
    WebElement allContractsTableMentor;

    @FindBy(xpath = "//div[contains(text(),'Contract date')]")
    WebElement allContractsTableContractDate;

    @FindBy(xpath = "//div[contains(text(),'Type')]")
    WebElement allContractsTableContractType;

    @FindBy(xpath = "//div[contains(text(),'Status')]")
    WebElement allContractsTableContractStatus;

    @FindBy(xpath = "//thead/tr[1]/th[1]/div[1]")
    WebElement testContractsTableContract;

    @FindBy(xpath = "//div[contains(text(),'Client')]")
    WebElement testContractsTableClient;

    @FindBy(xpath = "//div[contains(text(),'Consultancy')]")
    WebElement testContractsTableConsultancy;

    @FindBy(xpath = "//div[contains(text(),'Mentor')]")
    WebElement testContractsTableMentor;

    @FindBy(xpath = "//div[contains(text(),'Contract date')]")
    WebElement testContractsTableContractDate;

    @FindBy(xpath = "//div[contains(text(),'Days in trial')]")
    WebElement testContractsTableTrialDays;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchContracts;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement refreshContracts;
}
