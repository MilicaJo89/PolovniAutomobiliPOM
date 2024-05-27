package Tests;

import Pages.*;
import UtilClass.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTestSecondVersion extends Methods {

    @Test
    public void SecondVersion() throws IOException, InterruptedException {
        PaBravoPageClass paBravoPageClass=new PaBravoPageClass();
        PAHomePageClass paHomePageClass= new PAHomePageClass();
        PaHvalaPageClass paHvalaPageClass= new PaHvalaPageClass();
        PALoginPageClass paLoginPageClass = new PALoginPageClass();
        PAProtonEmailPageClass paProtonEmailPageClass = new PAProtonEmailPageClass();
        PAProtonMailSigninPageClass paProtonMailSigninPageClass = new PAProtonMailSigninPageClass();
        PARegistrationPageClass paRegistrationPageClass = new PARegistrationPageClass();
        PAUserProfilePageClass paUserProfilePageClass = new PAUserProfilePageClass();

        paHomePageClass.setup();
        paHomePageClass.clickOnPostaviOglasButton();
        paLoginPageClass.clickRegistrujSeButton();
        paRegistrationPageClass.register();
        paRegistrationPageClass.checkCheckBoxes();
        paRegistrationPageClass.clickRegistracijaButton();
        paHvalaPageClass.verifyHvalaMessage();
        Thread.sleep(8000);
        paProtonMailSigninPageClass.protonMailLoad(Methods.driver);
        Thread.sleep(8000);
        paProtonMailSigninPageClass.signInToAccount();
        Thread.sleep(8000);
        paProtonMailSigninPageClass.clickOnMailElement();
        paProtonEmailPageClass.openUnreadEmail();
        Thread.sleep(8000);
        paProtonEmailPageClass.scrollDown(Methods.driver);
        Thread.sleep(8000);
        paProtonEmailPageClass.openActivationLink(Methods.driver);
        Thread.sleep(8000);
        paBravoPageClass.checkCheckBoxes();
        Thread.sleep(8000);
        paBravoPageClass.clickPotvrdiButton();
        paUserProfilePageClass.enterUserInformation();
        paUserProfilePageClass.saveButton();
        paUserProfilePageClass.verifySuccessMessage();
        paUserProfilePageClass.logOutButton();
        paHomePageClass.clickOnLoginButton();
        paRegistrationPageClass.loginAgain();
        paHomePageClass.validateAccountIsCorrect();
        paProtonEmailPageClass.openMailAndDeleteIt(Methods.driver);
    }
}
