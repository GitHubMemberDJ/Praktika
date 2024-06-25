package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {



    // 1 Locate "Sign in" link using Xpath
    @FindBy(xpath = "//span[@class='hidden-sm-down']")
    private WebElement linkSignIn;



    //Constructor to initialize elements________________________
    public MainPage(WebDriver driver) { super(driver); }
    //__________________________________________________________



    // 1 Method to click "Sign in"  link
    public void clicklinkSignin(){ linkSignIn.click(); }




}
