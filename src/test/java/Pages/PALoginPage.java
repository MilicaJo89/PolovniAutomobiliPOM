package Pages;


import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PALoginPage extends Methods {

    WebDriver driver;

    //paths
    public By registracija = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");


    public PALoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegistrujSeButton() {
        logger.info("registracija button is present");
        elementIsPresent(registracija);
        logger.info("click on the registracija button");
        clickonElement(registracija);
    }

}