package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{


    //1 Locate input "Search"
    @FindBy(xpath = "//input[@name='s']")
    private WebElement inputSearch;

    //2 press enter in search menu





    //Constructor to initialize elements___________________________________
    public SearchPage(WebDriver driver) { super(driver); }
    //_____________________________________________________________________



    //1 Method to type in input "Search"
    public void typeSearchElement(String element){inputSearch.sendKeys(Keys.ENTER);}

}
