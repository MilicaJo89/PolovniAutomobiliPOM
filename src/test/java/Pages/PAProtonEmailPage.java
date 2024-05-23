package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        logger.info("email is present");
        elementsPresent(emailtitle);
        logger.info("click on email");
        clickonElement(emailtitle);
    }


    public WebDriver scrollDown(WebDriver driver){
        logger.info("scroll dow to the link");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
        return driver;
    }


    public WebDriver openActivationLink(WebDriver driver){
        driver.switchTo().frame(1);
        logger.info("activation link is present");
        elementsPresent(partialLinkText);
        logger.info("click on activation link");
        clickonElement(partialLinkText);
        driver.switchTo().defaultContent();
        logger.info("pop up is present");
        elementsPresent(clickonit);
        logger.info("click on pop up");
        clickonElement(clickonit);
        return driver;
    }
    public void protonmail() {
        logger.info("open proton mail login page");
        driver.navigate().to("https://account.proton.me/login");
    }

    public WebDriver openMailAndDeleteIt(WebDriver driver) {
        driver.navigate().to("https://account.proton.me/login");
        logger.info("click on mail element");
        clickonElement(mailentrance);
        logger.info("click on email");
        clickonElement(email2);
        logger.info("click on trash can element");
        clickonElement(trashcan);
        return driver;
    }

}