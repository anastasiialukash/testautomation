package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    WebElement dashboardTab;

    @FindBy(id = "#activeStudentCount")
    WebElement activeStudentsCount;

    @FindBy(id = "#newStudentsCount")
    WebElement newStudentsCount;

    @FindBy(id = "#frozenStudentsCount")
    WebElement frozenStudentsCount;

    @FindBy(id = "#graduatedStudentsCount")
    WebElement graduatedStudentsCount;

    @FindBy(xpath = "//h3[contains(text(),'Consultancy Statistics')]")
    WebElement consultancyStatistics;

    @FindBy(xpath = "//th[contains(text(),'Consultancy')]")
    WebElement consultancyTableConsultancy;

    @FindBy(xpath = "//th[contains(text(),'Active Cases')]")
    WebElement consultancyTableActiveCases;

    @FindBy(xpath = "//th[contains(text(),'Frozen Cases')]")
    WebElement consultancyTableFrozenCases;

    @FindBy(xpath = "//th[contains(text(),'Completed Cases')]")
    WebElement completedCases;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement minusButton;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[2]")
    WebElement deleteButton;
}
