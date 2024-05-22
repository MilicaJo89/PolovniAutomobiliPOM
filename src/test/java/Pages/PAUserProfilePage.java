package Pages;

import UtilClass.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class PAUserProfilePage extends Methods {


    WebDriver driver;


    //paths
    public By name = By.xpath("//input[@name='first_name']");
    public By lastnames = By.xpath("//input[@name='last_name']");
    public By Address = By.xpath("//input[@name='address']");
    public By City = By.xpath("//input[@name='city']");
    public By Zipcode = By.xpath("//input[@name='zip_code']");
    public By Cellphone = By.xpath("//input[@id='cellphone']");
    public By okrug = By.xpath("//p[@title=' Odaberite okrug']");
    public By Sumadijski = By.xpath("//label[contains(.,'Šumadijski')]");
    public By savebutton = By.xpath("//button[@id='submit']");
    public By succesmesage = By.xpath("//div[@class='uk-alert uk-alert-success']");
    public By postavioglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By dropdownmenu = By.xpath("//i[@class='position-absolute uk-icon-caret-down']");
    public By logbutton = By.xpath("//li//a[@class='js-logout-link signin_menu_element']");


    public PAUserProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserInformation() throws IOException {
        elementsPresent(name);
        String Name = getFromProperties("firsname");
        type(name, Name);
        String LastName = getFromProperties("lastname");
        type(lastnames,LastName);
        String address1 = getFromProperties("address");
        type(Address, address1 );
        String city1 = getFromProperties("city");
        type(City, city1);
        String zip1 = getFromProperties("zipcode");
        type(Zipcode, zip1);
        String Cellphone1 = getFromProperties("cellphone");
        type(Cellphone, Cellphone1);
        clickonElement(okrug);
        clickonElement(Sumadijski);
    }

    public void saveButton(){
        scrollIntoView(savebutton);
        clickonElement(savebutton);
    }

    public void verifySuccessMessage() throws InterruptedException {
        scrollIntoView(postavioglas);
        Thread.sleep(3000);
        elementsPresent(succesmesage);
    }

    public void logOutButton(){
        hover(dropdownmenu);
        clickonElement(logbutton);
    }

}