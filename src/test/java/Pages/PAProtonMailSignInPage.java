package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.io.IOException;

public class PAProtonMailSignInPage extends Methods {

    WebDriver driver;


    //paths
    public By protonmail = By.xpath("//input[@id='username']");
    public By protonpass = By.xpath("//input[@id='password']");
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");
    public By login = By.xpath("//button[@class='button w-full button-large button-solid-norm mt-6']");



    public PAProtonMailSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver protonMailLoad(WebDriver driver){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://account.proton.me/login");
        return driver;
    }

    public void signInToAccount() throws IOException {
        elementsPresent(protonmail);
        clickonElement(protonmail);
        String ProtonMail = getFromProperties("protomail");
        type(protonmail,ProtonMail);
        elementsPresent(protonpass);
        clickonElement(protonpass);
        String ProtonPass = getFromProperties("password2");
        type(protonpass,ProtonPass);
        elementsPresent(login);
        clickonElement(login);
    }

    public void clickOnMailElement() throws InterruptedException {
        Thread.sleep(8000);
        elementsPresent(mailentrance);
        clickonElement(mailentrance);
    }

}