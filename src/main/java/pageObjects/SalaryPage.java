package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalaryPage {

    @FindBy(xpath = "//span[contains(text(),'Зарплаты')]")
    WebElement salaryTab;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[10]/ul[1]/li[1]/a[1]")
    WebElement salaryTable;

    @FindBy(xpath = "//div[contains(text(),'Id')]")
    WebElement salaryTableID;

    @FindBy(xpath = "//div[contains(text(),'Salary date')]")
    WebElement salaryTableSalaryDate;

    @FindBy(xpath = "//div[contains(text(),'Employee name')]")
    WebElement salaryTableEmployeeName;

    @FindBy(xpath = "//div[contains(text(),'Payroll period')]")
    WebElement salaryTablePayrollPeriod;

    @FindBy(xpath = "//div[contains(text(),'Amount, UAH')]")
    WebElement salaryTableAmount;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchSalary;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement refreshSalaryButton;

    @FindBy(xpath = "//body/aside[1]/div[1]/section[1]/ul[1]/li[10]/ul[2]/li[1]/a[1]")
    WebElement generateSalary;

    @FindBy(xpath = "//label[contains(text(),'Date from')]")
    WebElement generateSalaryTable;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement generateSalaryTableFrom;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
    WebElement generateSalaryTableTo;

    @FindBy(xpath = "//button[contains(text(),'Calculate salaries')]")
    WebElement calculateSalaryButton;
}
