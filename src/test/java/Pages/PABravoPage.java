package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;


public class PABravoPage extends Methods {

    //paths
    public By interestedinbuying =  By.xpath("//label//input[@id='interestedInBuying']");
    public By interestedinselling = By.xpath("//label//input[@id='interestedInSelling']");
    public By interestedinreviweing = By.xpath("//label//input[@id='interestedInReviewingOffer']");
    public By potvrdi = By.xpath("//button[@name='submit_registration_survey']");
    public By popup2 = By.xpath("//button[contains(text(),'U redu')]");



    public void checkCheckBoxes(){
        switchpages();
        ElementisPresent(interestedinbuying);
        clickonElement(interestedinbuying);
        ElementisPresent(interestedinselling);
        clickonElement(interestedinselling);
        ElementisPresent(interestedinreviweing);
        clickonElement(interestedinreviweing);
    }

    public void clickPotvrdiButton(){
        ElementisPresent(potvrdi);
        clickonElement(potvrdi);
        ElementisPresent(popup2);
        clickonElement(popup2);
    }



}
