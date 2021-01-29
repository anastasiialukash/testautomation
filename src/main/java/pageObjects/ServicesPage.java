package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ServicesPage extends BasePage {

    public ServicesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Услуги')]")
    WebElement servicesTab;

    @FindBy(xpath = "//*[@id='fixed-table-toolbar--buttons']/a")
    WebElement newConsultancyButton;

    @FindBy(xpath = "//input[@id='name']")
    WebElement newConsultancyName;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement newConsultancyDescription;

    @FindBy(id = "prices[0].amount")
    WebElement enterPriceUAH;

    @FindBy(id = "prices[1].amount")
    WebElement enterPriceEUR;

    @FindBy(id = "prices[2].amount")
    WebElement enterPriceUSD;

    @FindBy(xpath = "//input[@id='employeeRate.amount']")
    WebElement enterEmployeeRate;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveButton;

    @FindBy(xpath = "//button[contains(text(),'Go back')]")
    WebElement goBackButton;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteButton;

    @FindBy(xpath = "//div[contains(text(),'Id')]")
    WebElement serviceID;

    @FindBy(xpath = "//div[contains(text(),'Name')]")
    WebElement serviceNameColumn;

    @FindBy(xpath = "//div[contains(text(),'Description')]")
    WebElement serviceDescription;

    @FindBy(xpath = "//div[contains(text(),'Employee rate')]")
    WebElement serviceEmployeeRate;

    @FindBy(xpath = "//div[contains(text(),'Prices')]")
    WebElement servicePrice;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[3]/input[1]")
    WebElement searchService;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement refreshServicesButton;

    @FindBy(xpath = "/html/body/div/section/div[1]/div[2]/div[4]/div[1]/span[2]/span/button")
    WebElement dropDownList;

    String serviceNameRow = "/html/body/div/section/div[1]/div[2]/div[2]/table/tbody/tr/td[2]/a";
    String optionsOfDropDownList = "/html/body/div/section/div[1]/div[2]/div[4]/div[1]/span[2]/span/ul/li";

    public void openServicesTab() {
        servicesTab.click();
    }

    public void clickOnNewConsultancyButton() {
        newConsultancyButton.click();
    }

    public void enterConsultancyName(String consultancyName) {
        newConsultancyName.sendKeys(consultancyName);
    }

    public void enterConsultancyDescription(String consultancyDescription) {
        newConsultancyDescription.sendKeys(consultancyDescription);
    }

    public void enterPriceUAH(String priceUAH) {
        enterPriceUAH.clear();
        enterPriceUAH.sendKeys(priceUAH);
    }

    public void enterPriceEUR(String priceEUR) {
        enterPriceEUR.clear();
        enterPriceEUR.sendKeys(priceEUR);
    }

    public void enterPriceUSD(String priceUSD) {
        enterPriceUSD.clear();
        enterPriceUSD.sendKeys(priceUSD);
    }

    public void enterEmployeeRate(String rate) {
        enterEmployeeRate.sendKeys(rate);
    }

    public void saveConsultancy() {
        saveButton.click();
    }

    public void deleteConsultancy() {
        deleteButton.click();
    }

    public List<String> getNames() {
        List<WebElement> webElementsNames = getListOfElementsByXpath(serviceNameColumn, serviceNameRow);
        List<String> namesList = new ArrayList<>();
        for (WebElement el : webElementsNames) {
            namesList.add(el.getText());
        }
        return namesList;
    }

    public void goBack() {
        goBackButton.click();
    }

    public boolean newConsultancyIsSaved(String consultancyName) {
        List<WebElement> options = getListOfElementsByXpath(dropDownList, optionsOfDropDownList);
        dropDownList.click();
        options.get(options.size() - 1).click();
        List<String> names = getNames();
        return names.contains(consultancyName);
    }
}
