package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.io.IOException;

public class PAProtonMailSignInPage extends Methods {

    WebDriver driver;


    //paths

    public By protonmail = By.xpath("//input[@id='username']");
    public By protonpass = By.xpath("//input[@id='password']");
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");


    public void protonMailLoad(){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://account.proton.me/login");
    }

    public void signInToAccount() throws IOException {
        ElementisPresent(protonmail);
        clickonElement(protonmail);
        String ProtonMail = GetFromProperties("protomail");
        type(protonmail,ProtonMail);
        ElementisPresent(protonpass);
        clickonElement(protonpass);
        String ProtonPass = GetFromProperties("password2");
        type(protonpass,ProtonPass);
    }

    public void clickOnMailElement() throws InterruptedException {
        Thread.sleep(8000);
        ElementisPresent(mailentrance);
        clickonElement(mailentrance);
    }




}
