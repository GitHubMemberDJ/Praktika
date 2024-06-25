package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CreateNewAccountPage;
import pageobjects.MainPage;
import utils.GeneratorUtil;

public class CreateNewAccountTest extends BaseTest{

    //call the method from CreateNewAccountPage
    MainPage mainPage;
    CreateNewAccountPage createNewAccountPage;


    @Test
    void testCreateNewAccountPage(){

        //initialization
        mainPage = new MainPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);


        //tests
        mainPage.clicklinkSignin();
        createNewAccountPage.clicklinkCreateOneHere();
        createNewAccountPage.selectRadioButtonGender1();
        createNewAccountPage.typeFirstName("Janet");
        createNewAccountPage.typeLastName("Jones");

        String mail = GeneratorUtil.generateRandomEmail();
        createNewAccountPage.typeEmail(mail);


        createNewAccountPage.typePassword("Janet.jones@1");
        createNewAccountPage.typeBirthdate("05/31/1970");
        createNewAccountPage.markBoxOffers();
        createNewAccountPage.markBoxIAgree();
        createNewAccountPage.markBoxNewsletter();
        createNewAccountPage.markBoxPrivacy();
        createNewAccountPage.clickButtonSave();
        createNewAccountPage.clickButtonSighout();

    }
}
