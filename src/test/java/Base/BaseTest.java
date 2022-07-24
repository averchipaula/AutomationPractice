package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver Driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");

        Driver = new ChromeDriver();

        Driver.get("http://automationpractice.com/index.php");

        Driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return Driver;
    }


   // @After
   // public void Cleaner() {

       // Driver.quit();


    }




