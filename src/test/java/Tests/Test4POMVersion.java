package Tests;

import Pages.PAHomePage;
import Pages.PALoginPage;
import org.testng.annotations.Test;


public class Test4POMVersion {


    @Test
    public void VersionOfTest04() throws InterruptedException {
        PAHomePage homePage = new PAHomePage();
        PALoginPage loginPage = new PALoginPage();


        homePage.homePageSetUp();
        homePage.clickPostaviOglasButton();

        loginPage.clickRegistrujSeButton();



    }


}
