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
        generatedEmail = generateemail();
        type(mail,generatedEmail);
        String Password = GetFromProperties("password2");
        type(sifra1,Password);
        type(sifra2,Password);
    }

    public void checkCheckBoxes(){
        elementsPresent(prihvatamcheckbox);
        clickonElement(prihvatamcheckbox);
        elementsPresent(prodajacheckbox);
        clickonElement(prodajacheckbox);
        elementsPresent(kupovinacheckbox);
        clickonElement(kupovinacheckbox);
    }

    public void clickRegistracijaButton(){
        elementsPresent(regbutton);
        clickonElement(regbutton);
    }
    public void loginAgain() throws IOException {
        type(Username, generatedEmail);
        clickonElement(nextstep);
        String ProtonPass=GetFromProperties("password2");
        type(sifra3,ProtonPass);
        elementsPresent(regbutton);
        clickonElement(regbutton);
    }

}