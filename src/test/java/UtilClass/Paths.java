package UtilClass;

import org.openqa.selenium.By;

public class Paths {
    public By mail = By.id("email");
    public By sifra1 = By.id("password_first");
    public By sifra2 = By.id("password_second");
    public By poruka = By.xpath("//p[@class='uk-alert uk-alert-warning']");
    public By oglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By registracija = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");
    public By prihvatamcheckbox = By.xpath("//input[@id='tos']");
    public By prodajacheckbox = By.xpath("//input[@id='easySaleConsent']");
    public By kupovinacheckbox = By.xpath("//input[@id='easyBuyConsent']");
    public By regbutton = By.xpath("//button[@name='login']");
    public By protonmail = By.xpath("//input[@id='username']");
    public By protonpass = By.xpath("//input[@id='password']");
    public By login = By.xpath("//button[@class='button w-full button-large button-solid-norm mt-6']");
    public By emailtitle = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By clickonit = By.xpath("//button[@class='button button-medium button-solid-norm']");
    public By interestedinbuying =  By.xpath("//label//input[@id='interestedInBuying']");
    public By interestedinselling = By.xpath("//label//input[@id='interestedInSelling']");
    public By interestedinreviweing = By.xpath("//label//input[@id='interestedInReviewingOffer']");
    public By potvrdi = By.xpath("//button[@name='submit_registration_survey']");
    public By popup2 = By.xpath("//button[contains(text(),'U redu')]");
    public By email2 = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By trashcan = By.xpath("//div[@class='flex items-center toolbar-inner flex-nowrap gap-2']//button[@data-testid='toolbar:movetotrash']");
    public By message = By.xpath("//span[@class='ym-hide-content']");
    public By succesmesage = By.xpath("//div[@class='uk-alert uk-alert-success']");
    public By logbutton = By.xpath("//li//a[@class='js-logout-link signin_menu_element']");
    public By loginagain = By.xpath("//a[@class='uk-float-left js_ga-event signin_menu_element']");
    public By sifra3 = By.xpath("//input[@id='password_header']");
    public By savebutton = By.xpath("//button[@id='submit']");
    public By name = By.xpath("//input[@name='first_name']");
    public By lastnames = By.xpath("//input[@name='last_name']");
    public By Address = By.xpath("//input[@name='address']");
    public By City = By.xpath("//input[@name='city']");
    public By Zipcode = By.xpath("//input[@name='zip_code']");
    public By Cellphone = By.xpath("//input[@id='cellphone']");
    public By Username = By.xpath("//input[@id='username_header']");
    public By dropdownmenu = By.xpath("//i[@class='position-absolute uk-icon-caret-down']");
    public By postavioglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By okrug = By.xpath("//p[@title=' Odaberite okrug']");
    public By Sumadijski = By.xpath("//label[contains(.,'Šumadijski')]");
    public By nextstep = By.id("next-step");
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");

}
