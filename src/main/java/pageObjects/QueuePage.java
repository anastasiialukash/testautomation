package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePage {

    @FindBy(xpath = "//span[contains(text(),'Очередь')]")
    WebElement queueTab;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[1]/div[1]")
    WebElement queueID;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[2]/div[1]")
    WebElement queueConsultancy;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[3]/div[1]")
    WebElement queueClient;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[4]/div[1]")
    WebElement queuingDate;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[5]/div[1]")
    WebElement queuePriority;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th[6]/div[1]")
    WebElement queueAction;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement searchQueue;

    @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement refreshQueueButton;
}
