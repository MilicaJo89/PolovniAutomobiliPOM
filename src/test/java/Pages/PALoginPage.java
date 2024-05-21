package Pages;


import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PALoginPage extends Methods {

    WebDriver driver;



    //paths
    public By registracija = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");
    public By nextstep = By.id("next-step");
    public By Username = By.xpath("//input[@id='username_header']");
    public By regbutton = By.xpath("//button[@name='login']");


    public void clickRegistrujSeButton() throws InterruptedException {
        ElementisPresent(registracija);
        clickonElement(registracija);
    }

    public void loginAgain() throws IOException {
        String generatedEmail=generateemail();
        String ProtonPass=GetFromProperties("password2");
        logger.info("Write in the generated email in to the mail text field element");
        type(Username, generatedEmail);
        logger.info("Click on sledece button element");
        clickonElement(nextstep);
        logger.info("Write in password in lozinka text field element");
        type(sifra3,ProtonPass);
        logger.info("Prijavi se button element is present");
        ElementisPresent(regbutton);
        logger.info("Click on Prijavi se button element");
        clickonElement(regbutton);
    }




}
