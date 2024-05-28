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
        logger.info("text box name is present");
        elementIsPresent(name);
        logger.info("from properties file take value of first name");
        String Name = getFromProperties("firsname");
        logger.info("in name text box write in the first name value");
        type(name, Name);
        logger.info("from properties file take the value of last name");
        String LastName = getFromProperties("lastname");
        logger.info("in the last name text box write value of last name");
        type(lastnames,LastName);
        logger.info("from properties file take value of address");
        String address1 = getFromProperties("address");
        logger.info("in the address text box write address value ");
        type(Address, address1 );
        logger.info("from properties file take value of city");
        String city1 = getFromProperties("city");
        logger.info("in the city text box write city value");
        type(City, city1);
        logger.info("from properties file take value of zipcode");
        String zip1 = getFromProperties("zipcode");
        logger.info("in the zipcode text box write zipcode value");
        type(Zipcode, zip1);
        logger.info("from properties file take cellphone value");
        String Cellphone1 = getFromProperties("cellphone");
        logger.info("in the cellphone text box write cellphone value");
        type(Cellphone, Cellphone1);
        logger.info("click on okrug element");
        clickOnElement(okrug);
        logger.info("click on sumadijski element");
        clickOnElement(Sumadijski);
    }

    public void saveButton(){
        logger.info("scroll down to the save button");
        scrollIntoView(savebutton);
        logger.info("click on the save button");
        clickOnElement(savebutton);
    }

    public void verifySuccessMessage() throws InterruptedException {
        logger.info("scroll up to the message");
        scrollIntoView(postavioglas);
        Thread.sleep(3000);
        logger.info("verify success message");
        elementIsPresent(succesmesage);
    }

    public void logOutButton(){
        logger.info("hover over dropdown menu to open it");
        hover(dropdownmenu);
        logger.info("Click on log out button");
        clickOnElement(logbutton);
    }

}