package Pages;


import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PALoginPage extends Methods {

    WebDriver driver;
    WebDriverWait wait;


    //paths
    public By registracija = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");




    public void clickRegistrujSeButton() throws InterruptedException {
        wait(4000);
        ElementisPresent(registracija);
        clickonElement(registracija);
    }




}
