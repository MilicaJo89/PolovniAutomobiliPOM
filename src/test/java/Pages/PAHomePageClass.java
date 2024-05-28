package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PAHomePageClass extends Methods {


    WebDriver driver;

    //paths
    public By oglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By loginagain = By.xpath("//a[@class='uk-float-left js_ga-event signin_menu_element']");
    public By message = By.xpath("//span[@class='ym-hide-content']");


    public PAHomePageClass PAHomePage(WebDriver driver) {
        this.driver = driver;
        return this;
    }


    public PALoginPageClass clickOnPostaviOglasButton(){
        logger.info("postavi oglas button is present");
        elementIsPresent(oglas);
        logger.info("click on postavi oglas button");
        clickOnElement(oglas);
        return new PALoginPageClass().PALoginPage(driver);
    }

    public PARegistrationPageClass clickOnLoginButton(){
        logger.info("click on login button");
        clickOnElement(loginagain);
        return new PARegistrationPageClass().PARegistrationPage(driver);
    }

    public PAHomePageClass validateAccountIsCorrect(){
        logger.info("validate that the account is correct");
        elementIsPresent(message);
        return PAHomePage(driver);
    }

}
