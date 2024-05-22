package Tests;


import Pages.*;
import UtilClass.Methods;
import org.testng.annotations.Test;

import java.io.IOException;


public class Test4POMVersion extends Methods {


    @Test
    public void VersionOfTest04() throws IOException, InterruptedException {
        PAHomePage homePage = new PAHomePage(Methods.driver);
        PALoginPage loginPage = new PALoginPage(Methods.driver);
        PABravoPage bravoPage = new PABravoPage(Methods.driver);
        PAHvalaPage hvalaPage = new PAHvalaPage(Methods.driver);
        PAProtonEmailPage protonEmailPage = new PAProtonEmailPage(Methods.driver);
        PAProtonMailSignInPage paProtonMailSignInPage= new PAProtonMailSignInPage(Methods.driver);
        PARegistrationPage registrationPage = new PARegistrationPage(Methods.driver);
        PAUserProfilePage userProfilePage = new PAUserProfilePage(Methods.driver);

        homePage.Setup();
        homePage.ClickOnPostaviOglasButton();
        loginPage.clickRegistrujSeButton();
        registrationPage.register();
        registrationPage.checkCheckBoxes();
        registrationPage.clickRegistracijaButton();
        hvalaPage.verifyHvalaMessage();
        Thread.sleep(5000);
        paProtonMailSignInPage.protonMailLoad(Methods.driver);
        Thread.sleep(3000);
        paProtonMailSignInPage.signInToAccount();
        Thread.sleep(5000);
        paProtonMailSignInPage.clickOnMailElement();
        protonEmailPage.openUnreadEmail();
        Thread.sleep(3000);
        protonEmailPage.scrollDown(Methods.driver);
        Thread.sleep(2000);
        protonEmailPage.openActivationLink(Methods.driver);
        Thread.sleep(3000);
        bravoPage.checkCheckBoxes();
        Thread.sleep(5000);
        bravoPage.clickPotvrdiButton();
        Thread.sleep(5000);
        userProfilePage.enterUserInformation();
        userProfilePage.saveButton();
        userProfilePage.verifySuccessMessage();
        userProfilePage.logOutButton();
        homePage.clickOnLoginButton();
        registrationPage.loginAgain();
        homePage.validateAccountIsCorrect();
        protonEmailPage.openMailAndDeleteIt(Methods.driver);
        protonEmailPage.PermanentlyDeleteIt(Methods.driver);
    }
}