package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PAProtonEmailPage extends Methods {

    WebDriver driver;


    //paths
    public By emailtitle = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By clickonit = By.xpath("//button[@class='button button-medium button-solid-norm']");
    public By email2 = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By trashcan = By.xpath("//div[@class='flex items-center toolbar-inner flex-nowrap gap-2']//button[@data-testid='toolbar:movetotrash']");
    public By partialLinkText = By.partialLinkText("https://www.polovniautomobili.com/aktivacija-naloga?user=2");
    public By folderButton= By.xpath("//button[@title='More']");
    public By trashButton = By.xpath("//a[@data-testid='navigation-link:trash']");
    public By checkMark = By.xpath("//span[@data-testid='element-list:message-checkbox']");
    public By permanentDelete = By.xpath("//button[@data-testid='toolbar:deletepermanently']");
    public By deleteButton = By.xpath("//button[@data-testid='permanent-delete-modal:submit']");
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");

    public PAProtonEmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUnreadEmail() throws InterruptedException {
        Thread.sleep(10000);
        elementsPresent(emailtitle);
        clickonElement(emailtitle);
    }


    public WebDriver scrollDown(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
        return driver;
    }


    public WebDriver openActivationLink(WebDriver driver){
        driver.switchTo().frame(1);
        elementsPresent(partialLinkText);
        clickonElement(partialLinkText);
        driver.switchTo().defaultContent();
        elementsPresent(clickonit);
        clickonElement(clickonit);
        return driver;
    }
    public void Protonmail() {
        driver.navigate().to("https://account.proton.me/login");
    }

    public WebDriver openMailAndDeleteIt(WebDriver driver) {
        driver.navigate().to("https://account.proton.me/login");
        clickonElement(mailentrance);
        clickonElement(email2);
        clickonElement(trashcan);
        return driver;
    }

    public WebDriver PermanentlyDeleteIt(WebDriver driver){
        elementsPresent(folderButton);
        clickonElement(folderButton);
        elementsPresent(trashButton);
        clickonElement(trashButton);
        elementsPresent(checkMark);
        clickonElement(checkMark);
        elementsPresent(permanentDelete);
        clickonElement(permanentDelete);
        elementsPresent(deleteButton);
        clickonElement(deleteButton);
        return driver;
    }
}