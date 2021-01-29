package tests;

import org.junit.Assert;
import org.junit.Test;

public class ServicesTests extends BaseTest {

    final String CONSULTANCY_NAME = "C-3PO";
    final String CONSULTANCY_DESCRIPTION = "Second Law. A robot must obey the orders given " +
            "it by human beings except where such orders would conflict with the First Law.";
    final String PRICE_UAH = "4220";
    final String PRICE_EUR = "123";
    final String PRICE_USD = "150";
    final String EMPLOYEE_RATE = "10000";

    @Test
    public void createNewConsultancy() {
        loginPage.login();
        servicesPage.openServicesTab();
        servicesPage.clickOnNewConsultancyButton();
        servicesPage.enterConsultancyName(CONSULTANCY_NAME);
        servicesPage.enterConsultancyDescription(CONSULTANCY_DESCRIPTION);
        servicesPage.enterPriceUAH(PRICE_UAH);
        servicesPage.enterPriceEUR(PRICE_EUR);
        servicesPage.enterPriceUSD(PRICE_USD);
        servicesPage.enterEmployeeRate(EMPLOYEE_RATE);
        servicesPage.saveConsultancy();
        Assert.assertTrue(servicesPage.newConsultancyIsSaved(CONSULTANCY_NAME));
    }
}
