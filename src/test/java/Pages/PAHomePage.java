package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PAHomePage extends Methods {

    WebDriver driver;
    WebDriverWait wait;

    //paths
    public By oglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By loginagain = By.xpath("//a[@class='uk-float-left js_ga-event signin_menu_element']");
    public By message = By.xpath("//span[@class='ym-hide-content']");


    public PAHomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnPostaviOglasButton(){
        elementsPresent(oglas);
        clickonElement(oglas);
    }

    public void clickOnLoginButton(){
        clickonElement(loginagain);
    }

    public void validateAccountIsCorrect(){
        elementsPresent(message);
    }

}