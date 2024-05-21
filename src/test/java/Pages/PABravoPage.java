package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PABravoPage extends Methods {

    //paths
    public By interestedinbuying =  By.xpath("//label//input[@id='interestedInBuying']");
    public By interestedinselling = By.xpath("//label//input[@id='interestedInSelling']");
    public By interestedinreviweing = By.xpath("//label//input[@id='interestedInReviewingOffer']");
    public By potvrdi = By.xpath("//button[@name='submit_registration_survey']");
    public By popup2 = By.xpath("//button[contains(text(),'U redu')]");

    WebDriver driver;

    public PABravoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkCheckBoxes(){
        switchpages();
        elementsPresent(interestedinbuying);
        clickonElement(interestedinbuying);
        elementsPresent(interestedinselling);
        clickonElement(interestedinselling);
        elementsPresent(interestedinreviweing);
        clickonElement(interestedinreviweing);
    }

    public void clickPotvrdiButton(){
        elementsPresent(potvrdi);
        clickonElement(potvrdi);
        elementsPresent(popup2);
        clickonElement(popup2);
    }



}
