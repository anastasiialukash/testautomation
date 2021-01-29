package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MentorsPage extends BasePage {

    public MentorsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Менторы')]")
    WebElement mentorsTab;

    @FindBy(xpath = "//*[@id='fixed-table-toolbar--buttons']/button")
    WebElement createEmployee;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement enterLastName;

    @FindBy(xpath = "//input[@id='maxClients']")
    WebElement enterMaxLoad;

    @FindBy(xpath = "//button[contains(text(),'save')]")
    WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'Id')]")
    WebElement mentorID;

    @FindBy(xpath = "//div[contains(text(),'name')]")
    WebElement mentorName;

    @FindBy(xpath = "//div[contains(text(),'workload')]")
    WebElement mentorWorkload;

    @FindBy(xpath = "//body/div[1]/section[1]/div[2]/div[1]/div[3]/input[1]")
    WebElement searchMentor;

    @FindBy(xpath = "//body/div[1]/section[1]/div[2]/div[1]/div[2]/button[1]")
    WebElement refreshMentorsButton;

    @FindBy(xpath = "/html/body/div/section/div[2]/div[2]/div[4]/div[1]/span[1]")
    WebElement numberOfTableEntries;

    @FindBy(xpath = "/html/body/div/section/div[2]/div[2]/div[4]/div[1]/span[2]/span/button")
    WebElement dropDownList;

    String columnNameRow = "//table[@class='table table-hover']/tbody/tr/td/a/span";
    String columnWorkloadRow = "//table[@class='table table-hover']/tbody/tr/td[3]";
    String optionsOfDropDownList = "/html/body/div/section/div[2]/div[2]/div[4]/div[1]/span[2]/span/ul/li";


    public void openMentorTab() {
        mentorsTab.click();
    }

    public List<String> getNames() {
        List<WebElement> webElementsNames = getListOfElementsByXpath(mentorName, columnNameRow);
        List<String> namesList = new ArrayList<>();
        for (WebElement el : webElementsNames) {
            namesList.add(el.getText());
        }
        return namesList;
    }

    public List<String> getWorkload() {
        List<WebElement> webElementList = getListOfElementsByXpath(mentorWorkload, columnWorkloadRow);
        List<String> workloadList = new ArrayList<>();
        for (WebElement el : webElementList) {
            workloadList.add(el.getText());
        }
        return workloadList;
    }

    public String getNumberOfTableEntries() {
        String totalNumberOfEntries = numberOfTableEntries.getText();
        String[] strings = totalNumberOfEntries.split(" ");
        return strings[strings.length - 1];
    }

    public void clickOnCreateEmployeeButton() {
        createEmployee.click();
    }

    public void enterEmployeesFirstName(String firstName) {
        enterFirstName.sendKeys(firstName);
    }

    public void enterEmployeesLastName(String lastName) {
        enterLastName.sendKeys(lastName);
    }

    public void enterEmployeesMaxLoad(String maxLoad) {
        enterMaxLoad.sendKeys(maxLoad);
    }

    public void saveNewEmployee() {
        saveButton.click();
    }

    public boolean newMentorIsSaved(String mentorsFirstName, String mentorsLastName) {
        List<WebElement> options = getListOfElementsByXpath(dropDownList, optionsOfDropDownList);
        dropDownList.click();
        options.get(options.size() - 1).click();
        List<String> names = getNames();
        return names.contains(mentorsFirstName + " " + mentorsLastName);
    }
}
