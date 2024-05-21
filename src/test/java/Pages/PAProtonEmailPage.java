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


    public PAProtonEmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUnreadEmail() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Email title element is present");
        elementsPresent(emailtitle);
        logger.info("Click on email title element");
        clickonElement(emailtitle);
    }


    public WebDriver scrollDown(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
        return driver;
    }


    public WebDriver openActivationLink(WebDriver driver){
        driver.switchTo().frame(1);
        WebElement element = driver.findElement(By.partialLinkText("https://www.polovniautomobili.com/aktivacija-naloga?user=2"));
        element.click();
        driver.switchTo().defaultContent();
        elementsPresent(clickonit);
        logger.info("Click on pop up element");
        clickonElement(clickonit);
        return driver;
    }
    public void Protonmail() {
        driver.navigate().to("https://account.proton.me/login");
    }
    public WebDriver openMailAndDeleteIt(WebDriver driver) {

        driver.navigate().to("https://account.proton.me/login");
        clickonElement(mailentrance);
        //delete email//
        logger.info("Click on email element");
        clickonElement(email2);
        logger.info("Click on trash can element in the email element");
        clickonElement(trashcan);
        return driver;
    }
}
