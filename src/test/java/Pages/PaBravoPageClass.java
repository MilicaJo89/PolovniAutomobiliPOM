package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaBravoPageClass extends Methods {
    public By interestedinbuying =  By.xpath("//label//input[@id='interestedInBuying']");
    public By interestedinselling = By.xpath("//label//input[@id='interestedInSelling']");
    public By interestedinreviweing = By.xpath("//label//input[@id='interestedInReviewingOffer']");
    public By potvrdi = By.xpath("//button[@name='submit_registration_survey']");
    public By popup2 = By.xpath("//button[contains(text(),'U redu')]");


    WebDriver driver;


    public PaBravoPageClass BravoPage(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public PaBravoPageClass checkCheckBoxes(){
        logger.info("driver switch to this page");
        switchpages();
        logger.info("zainteresovan za kupovinu check box is present");
        elementIsPresent(interestedinbuying);
        logger.info("check zainteresovan za kupovinu check box");
        clickonElement(interestedinbuying);
        logger.info("zainteresovan za prodaju check box is present");
        elementIsPresent(interestedinselling);
        logger.info("check zainteresovan za prodaju check box");
        clickonElement(interestedinselling);
        logger.info("zainteresovan za recanziju check box is present");
        elementIsPresent(interestedinreviweing);
        logger.info("check zainteresovan za recenziju check box");
        clickonElement(interestedinreviweing);
        return BravoPage(driver);
    }

    public PAUserProfilePageClass clickPotvrdiButton(){
        logger.info("potvrdi button is present");
        elementIsPresent(potvrdi);
        logger.info("click potvrdi button");
        clickonElement(potvrdi);
        logger.info("pop up is present");
        elementIsPresent(popup2);
        logger.info("click on pop up");
        clickonElement(popup2);
        return new PAUserProfilePageClass();
    }

}
