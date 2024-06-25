package tests;

import org.junit.jupiter.api.Test;
import pageobjects.MainPage;

public class MainTest extends BaseTest {


    //call the method from MainPage
    MainPage mainPage;


    @Test
    void testlinkSignIn(){
        mainPage = new MainPage(driver);


        //tests
        mainPage.clicklinkSignin();


    }

}
