package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ClientsPage extends BasePage {

    protected WebDriverWait wait;

    public ClientsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 1000);
    }

    @FindBy(xpath = "//span[contains(text(),'Клиенты')]")
    WebElement clientsTab;

    @FindBy(xpath = "//button[contains(text(),'Create Client')]")
    WebElement createClientButton;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement clientsFirstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement clientsLastNameField;

    @FindBy(id = "firstName")
    WebElement clientsFormFirstNameField;

    @FindBy(id = "lastName")
    WebElement clientsFormLastNameField;

    @FindBy(id = "email")
    WebElement clientsFormEmailField;

    @FindBy(id = "country")
    WebElement clientsFormCountryField;

    @FindBy(id = "city")
    WebElement clientsFormCityField;

    @FindBy(id = "phoneNumber")
    WebElement clientsFormPhoneNumberField;

    @FindBy(id = "skype")
    WebElement clientsFormSkypeField;

    @FindBy(id = "extraFields0.value")
    WebElement clientsFormExtraEmailField;

    @FindBy(id = "extraFields1.value")
    WebElement clientsFormExtraSkypeField;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
    WebElement saveFormButton;

    @FindBy(xpath = "//*[@id='myModal']/div/div/div[2]/form/button")
    WebElement saveClientButton;

    @FindBy(xpath = "//div[contains(text(),'id')]")
    WebElement clientID;

    @FindBy(xpath = "//div[contains(text(),'Name')]")
    WebElement clientsNameColumn;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[3]/input[1]")
    WebElement searchClient;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement refreshClientsButton;

    @FindBy(xpath = "/html/body/div/section/div[1]/div[2]/div[4]/div[1]/span[2]/span/button")
    WebElement dropDownList;

    @FindBy(xpath = "/html/body/div/section/div[1]/div[2]/div[2]/table/tbody/tr/td[2]/a")
    WebElement clientsNameInRow;

    String clientsNameRow = "/html/body/div/section/div[1]/div[2]/div[2]/table/tbody/tr/td[2]";
    String optionsOfDropDownList = "/html/body/div/section/div[1]/div[2]/div[4]/div[1]/span[2]/span/ul/li";
    String clientsName = "//a[contains(text(),'%s')]";

    public String getClientsFirstNameField() {
        return clientsFirstNameField.getAttribute("value");
    }

    public String getClientsLastNameField() {
        return clientsLastNameField.getAttribute("value");
    }

    public String getClientsFormFirstNameField() {
        return clientsFormFirstNameField.getAttribute("value");
    }

    public String getClientsFormLastNameField() {
        return clientsFormLastNameField.getAttribute("value");
    }

    public String getClientsFormEmailField() {
        return clientsFormEmailField.getAttribute("value");
    }

    public String getClientsFormCountryField() {
        return clientsFormCountryField.getAttribute("value");
    }

    public String getClientsFormCityField() {
        return clientsFormCityField.getAttribute("value");
    }

    public String getClientsFormPhoneNumberField() {
        return clientsFormPhoneNumberField.getAttribute("value");
    }

    public String getClientsFormSkypeField() {
        return clientsFormSkypeField.getAttribute("value");
    }

    public String getClientsFormExtraEmailField() {
        return clientsFormExtraEmailField.getAttribute("value");
    }

    public String getClientsFormExtraSkypeField() {
        return clientsFormExtraSkypeField.getAttribute("value");
    }


    public void openClientsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(clientsTab)).click();
    }

    public void clickOnCreateNewClientButton() {
        createClientButton.click();
    }

    public void enterClientsFirstName(String firstName) {
        WebElement field = wait.until(ExpectedConditions.visibilityOf(clientsFirstNameField));
        field.sendKeys(firstName);
    }

    public void enterClientsLastName(String lastName) {
        clientsLastNameField.click();
        clientsLastNameField.sendKeys(lastName);
    }

    public void saveClient() {
        saveClientButton.click();
    }

    public List<String> getNames() {
        List<WebElement> webElementsNames = getListOfElementsByXpath(clientsNameColumn, clientsNameRow);
        List<String> namesList = new ArrayList<>();
        for (WebElement el : webElementsNames) {
            namesList.add(el.getText());
        }
        return namesList;
    }

    public boolean newClientIsSaved(String clientsFirstName, String clientsLastName) {
        if (dropDownList.isDisplayed()) {
            List<WebElement> options = getListOfElementsByXpath(dropDownList, optionsOfDropDownList);
            dropDownList.click();
            options.get(options.size() - 1).click();
        }
        List<String> names = getNames();
        return names.contains(clientsFirstName + " " + clientsLastName);
    }

    public boolean clientIsFound(String firstName, String lastName) {
        return clientsNameInRow.getText().equals(firstName + " " + lastName);
    }

    public void enterClientsEmail(String email) {
        clientsFormEmailField.click();
        clientsFormEmailField.sendKeys(email);
    }

    public void enterClientsCountry(String country) {
        clientsFormCountryField.click();
        clientsFormCountryField.sendKeys(country);
    }

    public void enterClientsCity(String city) {
        clientsFormCityField.click();
        clientsFormCityField.sendKeys(city);
    }

    public void enterClientsPhone(String phone) {
        clientsFormPhoneNumberField.click();
        clientsFormPhoneNumberField.sendKeys(phone);
    }

    public void enterClientsSkype(String skype) {
        clientsFormSkypeField.click();
        clientsFormSkypeField.sendKeys(skype);
    }

    public void findExistingClient(String firstName, String lastName) {
        String name = firstName + " " + lastName;
        wait.until(ExpectedConditions.visibilityOf(searchClient)).click();
        searchClient.sendKeys(firstName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(clientsName, name)))).click();
    }

    public void saveForm() {
        saveFormButton.click();
    }
}

