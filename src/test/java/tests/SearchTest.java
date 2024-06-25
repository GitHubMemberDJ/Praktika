package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CreateNewAccountPage;
import pageobjects.LoginPage;
import pageobjects.MainPage;
import pageobjects.SearchPage;

public class SearchTest extends BaseTest{

    //call the method from Search Page
    MainPage mainPage;
    CreateNewAccountPage createNewAccountPage;
    LoginPage loginPage;
    SearchPage searchPage;

    @Test
    void testLoginPage() {

        //initialization
        mainPage = new MainPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);


        //tests
        mainPage.clicklinkSignin();
        loginPage.typeEmail("290j.jons@gmail.com");
        loginPage.typePassword2("Janet.jones@1");
        loginPage.clickSighIn();

        searchPage.typeSearchElement("art");




    }
}
