package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CreateNewAccountPage;
import pageobjects.LoginPage;
import pageobjects.MainPage;

public class LoginTest extends BaseTest{


    //call the method from LoginPage
    MainPage mainPage;
    CreateNewAccountPage createNewAccountPage;
    LoginPage loginPage;

    @Test
    void testLoginPage() {

        //initialization
        mainPage = new MainPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        loginPage = new LoginPage(driver);


        //tests
        mainPage.clicklinkSignin();
        loginPage.typeEmail("290j.jons@gmail.com");
        loginPage.typePassword2("Janet.jones@1");
        loginPage.clickSighIn();



    }

}
