package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    protected List<WebElement> getListOfElementsByXpath(WebElement webElement, String locator) {
        return webElement.findElements(By.xpath(locator));
    }
}
