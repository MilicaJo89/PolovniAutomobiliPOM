package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class PARegistrationPage extends Methods {


    WebDriver driver;


    //paths
    public By mail = By.id("email");
    public By sifra1 = By.id("password_first");
    public By sifra2 = By.id("password_second");
    public By prihvatamcheckbox = By.xpath("//input[@id='tos']");
    public By prodajacheckbox = By.xpath("//input[@id='easySaleConsent']");
    public By kupovinacheckbox = By.xpath("//input[@id='easyBuyConsent']");
    public By regbutton = By.xpath("//button[@name='login']");
    public By sifra3 = By.xpath("//input[@id='password_header']");
    public By nextstep = By.id("next-step");
    public By Username = By.xpath("//input[@id='username_header']");


    public String generatedEmail;


    public PARegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register() throws IOException {
        logger.info("email is generated");
        generatedEmail = generateemail();
        logger.info("in the email text box write the generated email value");
        type(mail,generatedEmail);
        logger.info("from the properties file get password value");
        String Password = getFromProperties("password2");
        logger.info("in the password text box write password value");
        type(sifra1,Password);
        logger.info("in the repeated password text box write password value");
        type(sifra2,Password);
    }

    public void checkCheckBoxes(){
        logger.info("prihvatam check box is present");
        elementsPresent(prihvatamcheckbox);
        logger.info("check the prihvatam check box");
        clickonElement(prihvatamcheckbox);
        logger.info("prodaja check box is present");
        elementsPresent(prodajacheckbox);
        logger.info("check the prodaja check box");
        clickonElement(prodajacheckbox);
        logger.info("kupovina check box is present");
        elementsPresent(kupovinacheckbox);
        logger.info("check the kupovina check box");
        clickonElement(kupovinacheckbox);
    }

    public void clickRegistracijaButton(){
        logger.info("registracija button is present");
        elementsPresent(regbutton);
        logger.info("click on registacija button");
        clickonElement(regbutton);
    }
    public void loginAgain() throws IOException {
        logger.info("in the username text box write the generated email value ");
        type(Username, generatedEmail);
        logger.info("click on the next step element");
        clickonElement(nextstep);
        logger.info("from properties file get the value of proton pasword");
        String ProtonPass= getFromProperties("password2");
        logger.info("in the password text box write the password value");
        type(sifra3,ProtonPass);
        logger.info("login button element is present");
        elementsPresent(regbutton);
        logger.info("click on login button");
        clickonElement(regbutton);
    }

}