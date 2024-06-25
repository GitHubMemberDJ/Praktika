package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    // 1 Locate input "Email"
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    //2 Locate input "Password"
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword2;

    //3 Locate button "Sigh in"
    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement buttonSighIn;


    //Constructor to initialize elements___________________________________
    public LoginPage(WebDriver driver) { super(driver); }
    //_____________________________________________________________________


    //1 Method to type "Email"
    public void typeEmail(String email){inputEmail.sendKeys(email);}

    //2 Method to type "Password"
    public void typePassword2(String password){inputPassword2.sendKeys(password);}

    //3 Method to click button "Sigh in"
    public void clickSighIn(){buttonSighIn.click();}


}
