package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaHvalaPageClass extends Methods{

    WebDriver driver;

    //paths
    public By poruka = By.xpath("//p[@class='uk-alert uk-alert-warning']");

    public PaHvalaPageClass HvalaPage(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public PaHvalaPageClass verifyHvalaMessage() throws InterruptedException {
        Thread.sleep(3000);
        logger.info("hvala na registraciji message is present");
        elementIsPresent(poruka);
        return HvalaPage(driver);
    }
}