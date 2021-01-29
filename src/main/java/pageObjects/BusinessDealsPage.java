package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessDealsPage {

    @FindBy(xpath = "//span[contains(text(),'Сделки')]")
    WebElement businessDealsTab;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    WebElement newBusinessDeals;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    WebElement archiveDeals;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
    WebElement allBusinessDeals;

    @FindBy(xpath = "//div[contains(text(),'Id')]")
    WebElement dealsTableID;

    @FindBy(xpath = "//div[contains(text(),'Client')]")
    WebElement dealsTableClient;

    @FindBy(xpath = "//div[contains(text(),'Consultancy')]")
    WebElement dealsTableConsultancy;

    @FindBy(xpath = "//div[contains(text(),'status')]")
    WebElement dealsTableStatus;

    @FindBy(xpath = "//div[contains(text(),'Start date - Close date')])")
    WebElement dealsTableStartCloseDates;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchBusinessDeals;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement dealsRefreshButton;
}
