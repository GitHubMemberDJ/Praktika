package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//inherit all tests
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://192.168.1.123/login?back=http%3A%2F%2F192.168.1.123%2F");
    }


    @AfterEach
    void tearDown(){
       // driver.quit();
    }

}
