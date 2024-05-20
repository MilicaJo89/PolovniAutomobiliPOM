package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;

public class PARegistrationPage extends Methods {

    WebDriver driver;
    WebDriverWait wait;


    //paths
    public By mail = By.id("email");
    public By sifra1 = By.id("password_first");
    public By sifra2 = By.id("password_second");



    public void register() throws IOException {
        String generatedEmail = generateemail();
        type(mail,generatedEmail);
        String Password = GetFromProperties("password2");
        type(sifra1,Password);
        type(sifra2,Password);
    }



}
