package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.io.IOException;

public class PAProtonMailSigninPageClass extends Methods {

    WebDriver driver;


    //paths
    public By protonmail = By.xpath("//input[@id='username']");
    public By protonpass = By.xpath("//input[@id='password']");
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");
    public By login = By.xpath("//button[@class='button w-full button-large button-solid-norm mt-6']");



    public PAProtonMailSigninPageClass PAProtonMailSignInPage(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public WebDriver protonMailLoad(WebDriver driver){
        logger.info("open new window tab");
        driver.switchTo().newWindow(WindowType.TAB);
        logger.info("go to proton mail sign in page");
        driver.navigate().to("https://account.proton.me/login");
        return driver;
    }

    public PAProtonMailSigninPageClass signInToAccount() throws IOException {
        logger.info("Email text box is present");
        elementIsPresent(protonmail);
        logger.info("click on email text box element");
        clickOnElement(protonmail);
        logger.info("from properties file get proton mail value");
        String ProtonMail = getFromProperties("protomail");
        logger.info("in the email text box write the email value");
        type(protonmail,ProtonMail);
        logger.info("Password text box is present");
        elementIsPresent(protonpass);
        logger.info("click on password text box");
        clickOnElement(protonpass);
        logger.info("from properties file get proton password value");
        String ProtonPass = getFromProperties("password2");
        logger.info("in the password text box write the password value");
        type(protonpass,ProtonPass);
        logger.info("login button is present");
        elementIsPresent(login);
        logger.info("click login button");
        clickOnElement(login);
        return PAProtonMailSignInPage(driver);
    }

    public PAProtonEmailPageClass clickOnMailElement() throws InterruptedException {
        Thread.sleep(8000);
        logger.info("mail element is present");
        elementIsPresent(mailentrance);
        logger.info("click on mail element");
        clickOnElement(mailentrance);
        return  new PAProtonEmailPageClass().PAProtonEmailPage(driver);
    }
}
