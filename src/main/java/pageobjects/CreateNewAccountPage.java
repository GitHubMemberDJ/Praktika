package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccountPage extends BasePage{


    //1 Locate link "Create one here"
    @FindBy(xpath = "//a[@href='http://192.168.1.123/registration']")
    private WebElement linkCreateOneHere;

    //2 locate radio button "Social title Mr."
    @FindBy(xpath = "//input[@id='field-id_gender-1']")
    private WebElement radioButtonGender1;

    //3 locate input "First name"
    @FindBy(xpath = "//input[@id='field-firstname']")
    private WebElement inputFirstName;

    //4 locate input "Last name"
    @FindBy(xpath = "//input[@id='field-lastname']")
    private WebElement inputLastName;

    //5 locate input "Email"
    @FindBy(xpath = "//input[@id='field-email']")
    private WebElement inputEmail;

    //6 locate input "Passsword"
    @FindBy(xpath = "//input[@id='field-password']")
    private WebElement inputPassword;

    //7 locate input "Birthdate"
    @FindBy(xpath = "//input[@id='field-birthday']")
    private WebElement inputBirthdate;

    //8 locate checkbox "Offers"
    @FindBy(xpath = "//input[@name='optin']")
    private WebElement checkBoxOffers;

    //9 locate checkbox "I Agree"
    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement checkBoxIAgree;

    //10 locate checkbox "Newsletter"
    @FindBy(xpath = "//input[@name='newsletter']")
    private WebElement checkBoxNewsletter;

    //11 locate checkbox "Data privacy"
    @FindBy(xpath = "//input[@name='customer_privacy']")
    private WebElement checkBoxPrivacy;

    //12 locate button "Save"
    @FindBy(xpath = "//button[@class='btn btn-primary form-control-submit float-xs-right']")
    private WebElement buttonSave;

    //13 locate button "Sign out"
    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    private WebElement buttonSighout;




    //Constructor to initialize elements___________________________________
    public CreateNewAccountPage(WebDriver driver) { super(driver); }
    //_____________________________________________________________________



    //1 Method to click "Create one here" link
    public void clicklinkCreateOneHere(){ linkCreateOneHere.click();}

    //2 Method to choose "Mr."
    public  void selectRadioButtonGender1(){ radioButtonGender1.click();}

    //3 Method to type "First name"
    public void typeFirstName(String firstName){ inputFirstName.sendKeys(firstName);}

    //4 Method to type "Last name"
    public void typeLastName(String lastName){ inputLastName.sendKeys(lastName);}

    //5 Method to type "Email"
    public void typeEmail(String email){ inputEmail.sendKeys(email);}

    //6 Method to type "Password"
    public void typePassword(String password){ inputPassword.sendKeys(password);}

    //7 Method to type "Birthdate"
    public void typeBirthdate(String birthdate){ inputBirthdate.sendKeys(birthdate);}

    //8 Method to mark "receive offers"
    public void markBoxOffers(){checkBoxOffers.click();}

    //9 Method to mark "I Agree"
    public void markBoxIAgree(){checkBoxIAgree.click();}

    //10 Method to mark "Newsletter"
    public void markBoxNewsletter(){checkBoxNewsletter.click();}

    //11 Method to mark "Data privacy"
    public void markBoxPrivacy(){checkBoxPrivacy.click();}

    //12 Method to click button "Save"
    public void clickButtonSave(){buttonSave.click();}

    //13 Method to click button "Sigh out"
    public void clickButtonSighout(){buttonSighout.click();}

}
