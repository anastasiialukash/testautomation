package tests;

import org.junit.Assert;
import org.junit.Test;
import utils.Utils;

import java.util.Map;

public class ClientsTests extends BaseTest {

    Map<String, String> data = Utils.getNewClientData();
    final String CLIENTS_FIRST_NAME = data.get("FirstName");
    final String CLIENTS_LAST_NAME = data.get("LastName");
    final String CLIENTS_EMAIL = data.get("Email");
    final String CLIENTS_COUNTRY = data.get("Country");
    final String CLIENTS_CITY = data.get("City");
    final String CLIENTS_PHONE = data.get("Phone");
    final String CLIENTS_SKYPE = data.get("Skype");

    @Test
    public void createClient() {
        loginPage.login();
        clientsPage.openClientsTab();
        clientsPage.clickOnCreateNewClientButton();
        clientsPage.enterClientsFirstName(CLIENTS_FIRST_NAME);
        clientsPage.enterClientsLastName(CLIENTS_LAST_NAME);
        clientsPage.saveClient();
        clientsPage.openClientsTab();
        Assert.assertTrue(clientsPage.newClientIsSaved(CLIENTS_FIRST_NAME, CLIENTS_LAST_NAME));
        clientsPage.findExistingClient(CLIENTS_FIRST_NAME, CLIENTS_LAST_NAME);
        clientsPage.enterClientsEmail(CLIENTS_EMAIL);
        clientsPage.enterClientsCountry(CLIENTS_COUNTRY);
        clientsPage.enterClientsCity(CLIENTS_CITY);
        clientsPage.enterClientsPhone(CLIENTS_PHONE);
        clientsPage.enterClientsSkype(CLIENTS_SKYPE);
        clientsPage.saveForm();
        clientsPage.openClientsTab();
        clientsPage.findExistingClient(CLIENTS_FIRST_NAME, CLIENTS_LAST_NAME);
        Assert.assertEquals(data.get("FirstName"), clientsPage.getClientsFormFirstNameField());
        Assert.assertEquals(data.get("LastName"), clientsPage.getClientsFormLastNameField());
        Assert.assertEquals(data.get("Email"), clientsPage.getClientsFormEmailField());
        Assert.assertEquals(data.get("Country"), clientsPage.getClientsFormCountryField());
        Assert.assertEquals(data.get("City"), clientsPage.getClientsFormCityField());
        Assert.assertEquals(data.get("Phone"), clientsPage.getClientsFormPhoneNumberField());
        Assert.assertEquals(data.get("Skype"), clientsPage.getClientsFormSkypeField());
    }
}
