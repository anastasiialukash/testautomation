package tests;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MentorPageTests extends BaseTest {

    final String EMPLOYEES_FIRST_NAME = "George";
    final String EMPLOYEES_LAST_NAME = "Martin";
    final String MAX_WORKLOAD = "35";

    @Test
    public void getNames() {
        loginPage.login();
        mentorsPage.openMentorTab();
        List<String> names = mentorsPage.getNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void getWorkload() {
        loginPage.login();
        mentorsPage.openMentorTab();
        List<String> workload = mentorsPage.getWorkload();
        for (String amount : workload) {
            System.out.println(amount);
        }
    }

    @Test
    public void getTotalNumberOfTableEntries() {
        loginPage.login();
        mentorsPage.openMentorTab();
        System.out.println(mentorsPage.getNumberOfTableEntries());
    }

    @Test
    public void createNewEmployee() {
        loginPage.login();
        mentorsPage.openMentorTab();
        mentorsPage.clickOnCreateEmployeeButton();
        mentorsPage.enterEmployeesFirstName(EMPLOYEES_FIRST_NAME);
        mentorsPage.enterEmployeesLastName(EMPLOYEES_LAST_NAME);
        mentorsPage.enterEmployeesMaxLoad(MAX_WORKLOAD);
        mentorsPage.saveNewEmployee();
        Assert.assertTrue(mentorsPage.newMentorIsSaved(EMPLOYEES_FIRST_NAME, EMPLOYEES_LAST_NAME));
    }
}
