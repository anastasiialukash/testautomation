package tests;

import config.Config;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.ClientsPage;
import pageObjects.LoginPage;
import pageObjects.MentorsPage;
import pageObjects.ServicesPage;

import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;
    private final Config config = new Config();

    protected LoginPage loginPage;
    protected MentorsPage mentorsPage;
    protected ClientsPage clientsPage;
    protected ServicesPage servicesPage;

    @Before
    public void setup() throws IOException {
        String browser = config.readPropertyFile("browser", "config.properties");
        switch (browser) {
            case "chrome":
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                this.driver = new FirefoxDriver();
                break;
        }

        String address = config.readPropertyFile("url", "config.properties");
        driver.get(address);

        loginPage = new LoginPage(driver);
        mentorsPage = new MentorsPage(driver);
        clientsPage = new ClientsPage(driver);
        servicesPage = new ServicesPage(driver);

    }

    @After
    public void closeBrowser() {
        this.driver.quit();
    }
}
