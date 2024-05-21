package Tests;


import UtilClass.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase4 extends Methods {


    @Test
    public void Test04 () throws InterruptedException, IOException {


        logger.info("Opening polovni automobili web page");
        Setup();
        //click posltavi oglas//
        logger.info("Postavi oglas element is present");
        elementsPresent(oglas);
        logger.info("Click on Postavi oglas element");
        clickonElement(oglas);





        //click registruj se//
        logger.info("Registruj se element is present");
        elementsPresent(registracija);
        logger.info("Click on Registruj se element");
        clickonElement(registracija);


        //fill the boxes//
        logger.info("Get generated email from generate mail method");
        String generatedEmail = generateemail();
        logger.info("Write in the email in to the mail text box element");
        type(mail,generatedEmail);
        logger.info("Get password from properties file");
        String Password = GetFromProperties("password2");
        logger.info("Write password in to the lozinka text box element");
        type(sifra1,Password);
        logger.info("Write same password in to the ponovi lozinku text field element");
        type(sifra2,Password);


        //check the comboboxes//
        logger.info("Prihvatam check box element is present");
        elementsPresent(prihvatamcheckbox);
        logger.info("Click on prihvatam check box element");
        clickonElement(prihvatamcheckbox);
        logger.info("Prodajem check box element is present ");
        elementsPresent(prodajacheckbox);
        logger.info("Click on prodajem check box element");
        clickonElement(prodajacheckbox);
        logger.info("Kupijuem check box element is present");
        elementsPresent(kupovinacheckbox);
        logger.info("Click on kupujem check box element");
        clickonElement(kupovinacheckbox);


        //click registruj se//
        logger.info("Registruj se button element is present");
        elementsPresent(regbutton);
        logger.info("Click on registruj se button");
        clickonElement(regbutton);


        //validate that the "hvala na registraciji" message is present//
        Thread.sleep(3000);
        logger.info("Hvala na registraciji message is present");
        elementsPresent(poruka);


        //open new tab for protonmail//
        logger.info("new tab opens and proton mail is opened");
        ProtonSetup();
        Thread.sleep(3000);


        //login proces//
        logger.info("Email text field element is present");
        elementsPresent(protonmail);
        logger.info("Click on email text field element");
        clickonElement(protonmail);
        logger.info("Get proton email from properties file");
        String ProtonMail = GetFromProperties("protomail");
        logger.info("Write in the proton email in to the proton email text field element");
        type(protonmail,ProtonMail);
        logger.info("Password text field element is present");
        elementsPresent(protonpass);
        logger.info("Click on password text field element");
        clickonElement(protonpass);
        logger.info("Get proton password from properties file");
        String ProtonPass = GetFromProperties("password2");
        logger.info("Write in the proton password in to the proton password text box field element");
        type(protonpass,ProtonPass);


        //click login button//
        logger.info("Login button element is present");
        elementsPresent(login);
        logger.info("Click on Login button element");
        clickonElement(login);


        //open the activation email//
        Thread.sleep(10000);
        logger.info("Click on Proton mail element");
        elementsPresent(mailentrance);
        clickonElement(mailentrance);
        Thread.sleep(10000);
        logger.info("Email title element is present");
        elementsPresent(emailtitle);
        logger.info("Click on email title element");
        clickonElement(emailtitle);
        Thread.sleep(3000);
        logger.info("Scroll down");
        scrolldown();
        Thread.sleep(3000);
        ClickOnLink();
        logger.info("Pop up element is present");
        elementsPresent(clickonit);
        logger.info("Click on pop up element");
        clickonElement(clickonit);


        logger.info("Driver switches pages");
        switchpages();
        Thread.sleep(3000);


        //click on elements//
        logger.info("Zainteresovan za kupovinu check box element is present");
        elementsPresent(interestedinbuying);
        logger.info("Click on zainteresovan za kupovinu check box element");
        clickonElement(interestedinbuying);
        logger.info("Zainteresovan za prodaju check box element is present");
        elementsPresent(interestedinselling);
        logger.info("Click on zainteresovan za prodaju check box element");
        clickonElement(interestedinselling);
        logger.info("Zainteresovan za recenziju check box element is present");
        elementsPresent(interestedinreviweing);
        logger.info("Click on zainteresovan za recenziju check box element");
        clickonElement(interestedinreviweing);


        //click button potvrdi//
        logger.info("Potvrdi button element is present");
        elementsPresent(potvrdi);
        logger.info("Click on Potvrdi button element");
        clickonElement(potvrdi);


        //click pop up 2//
        logger.info("Pop up message element is present");
        elementsPresent(popup2);
        logger.info("Click on pop up message element");
        clickonElement(popup2);


        Thread.sleep(6000);
        //type needed information//
        logger.info("Ime text field is present");
        elementsPresent(name);
        logger.info("Get first name from properties file");
        String Name = GetFromProperties("firsname");
        logger.info("Write in the name in to the ime text field element");
        type(name, Name);
        logger.info("Get last name from properties file");
        String LastName = GetFromProperties("lastname");
        logger.info("Write in the last name in prezime text field element");
        type(lastnames,LastName);
        logger.info("Get address from properties file");
        String address1 = GetFromProperties("address");
        logger.info("Write in the address in to the adresa text file element");
        type(Address, address1 );
        logger.info("Get city from properties");
        String city1 = GetFromProperties("city");
        logger.info("Write in the city in to the grad text field element");
        type(City, city1);
        logger.info("Get zipcode from the properties file");
        String zip1 = GetFromProperties("zipcode");
        logger.info("Write in the zipcode in to the postanski broj text field element");
        type(Zipcode, zip1);
        logger.info("Get cellphone from properties file");
        String Cellphone1 = GetFromProperties("cellphone");
        logger.info("Write in the cellphone number in to the mobilni telefon text field element");
        type(Cellphone, Cellphone1);
        logger.info("Click on element Okrug");
        clickonElement(okrug);
        logger.info("Click on element Sumadijski");
        clickonElement(Sumadijski);


        //scroll to sacuvaj and click it//
        logger.info("Scroll down until save button element is in view");
        ScrollIntoView(savebutton);
        logger.info("Click on save button element");
        clickonElement(savebutton);


        //check message//
        logger.info("Scroll up until the postavi oglas element is in view");
        ScrollIntoView(postavioglas);
        Thread.sleep(3000);
        logger.info("Success message element is present");
        elementsPresent(succesmesage);


        //logout//
        logger.info("Hover over Moj profil drop down menu element");
        hover(dropdownmenu);
        logger.info("Click on izloguj se element");
        clickonElement(logbutton);


        logger.info("Click on uloguj se element");
        clickonElement(loginagain);


        //login//
        logger.info("Write in the generated email in to the mail text field element");
        type(Username, generatedEmail);
        logger.info("Click on sledece button element");
        clickonElement(nextstep);
        logger.info("Write in password in lozinka text field element");
        type(sifra3,ProtonPass);
        logger.info("Prijavi se button element is present");
        elementsPresent(regbutton);
        logger.info("Click on Prijavi se button element");
        clickonElement(regbutton);


        //verify that it is correct account//
        Thread.sleep(5000);
        logger.info("Account is correct");
        elementsPresent(message);


        //open mail//
        logger.info("Open proton mail page");
        Protonmail();


        clickonElement(mailentrance);


        //delete email//
        logger.info("Click on email element");
        clickonElement(email2);
        logger.info("Click on trash can element in the email element");
        clickonElement(trashcan);
    }

}