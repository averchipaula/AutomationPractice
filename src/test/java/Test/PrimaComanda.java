package Test;

import Base.BaseTest;
import Help.ElementMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PrimaComanda extends BaseTest {


    @Test

    public void FtOrder(){
        ElementMethods elementMethods = new ElementMethods(Driver);

        WebElement signInButtonElement = Driver.findElement(By.cssSelector(".login"));
        elementMethods.clickElement(signInButtonElement);

        WebElement emailElement = Driver.findElement(By.id("email"));
        String emailValue = "averchipaula20@gmail.com";
        elementMethods.fillElement(emailElement,emailValue);

        WebElement passElement = Driver.findElement(By.id("passwd"));
        String passValue = "fjnfjk";
        elementMethods.fillElement(passElement,passValue);

        WebElement submitElement = Driver.findElement(By.id("SubmitLogin"));
        elementMethods.clickElement(submitElement);

        WebElement womenButtonElement = Driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
        elementMethods.clickElement(womenButtonElement);


        WebElement dressesButtonElement = Driver.findElement(By.xpath("//*[@id='subcategories']/ul/li[2]/div[1]/a"));
        elementMethods.clickElement(dressesButtonElement);

        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement summerdButtonElement = Driver.findElement(By.xpath("//*[@id='subcategories']/ul/li[3]/div[1]/a"));
        elementMethods.clickElement(summerdButtonElement);










    }


}
