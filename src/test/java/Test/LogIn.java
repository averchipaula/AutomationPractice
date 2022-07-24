package Test;

import Base.BaseTest;
import Help.ElementMethods;
import Pages.IndexPage;
import Pages.LogInPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.sql.DriverManager.getDriver;


public class LogIn extends BaseTest {

    @Test

    public void SignUp() {
        //  ElementMethods elementMethods = new ElementMethods(Driver);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();

        //validam pagina de login
        LogInPage loginPage = new LogInPage(getDriver());
        loginPage.loginInValidProcess("LogIn", "rjkj@gmail.com",
                "fjnfjk","Invalid email address.");

    }





    // WebElement signInButtonElement = Driver.findElement(By.cssSelector(".login"));
    // elementMethods.clickElement(signInButtonElement);

    // WebElement emailElement = Driver.findElement(By.id("email"));
    // String emailValue = "averchipaula20@gmail.com";
    // elementMethods.fillElement(emailElement,emailValue);

    //  WebElement passElement = Driver.findElement(By.id("passwd"));
    //  String passValue = "fjnfjk";
    //  elementMethods.fillElement(passElement,passValue);

    //  WebElement submitElement = Driver.findElement(By.id("SubmitLogin"));
    // elementMethods.clickElement(submitElement);
}




