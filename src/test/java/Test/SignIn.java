package Test;

import Base.BaseTest;
import Help.ElementMethods;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SignIn extends BaseTest {

    @Test

    public void SignIn(){

        ElementMethods elementMethods = new ElementMethods(Driver);

        WebElement signInButtonElement = Driver.findElement(By.cssSelector(".login"));
        elementMethods.clickElement(signInButtonElement);

        WebElement createAccountElement = Driver.findElement(By.xpath("//*[@id='email_create']"));
        String emailvalue="averchipaula20@gmail.com";
        elementMethods.fillElement(createAccountElement,emailvalue);

        WebElement clickAccountElement = Driver.findElement(By.xpath("//*[@id='SubmitCreate']/span/i"));
        elementMethods.clickElement(clickAccountElement);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }


        WebElement clickGenderElement = Driver.findElement(By.id("uniform-id_gender2"));
        elementMethods.clickElement(clickGenderElement);

        WebElement firstNameElement = Driver.findElement(By.cssSelector("#customer_firstname"));
        String firstName= "Paula";
        elementMethods.fillElement(firstNameElement,firstName);

        WebElement lastNameElement = Driver.findElement(By.cssSelector("#customer_lastname"));
        String lastName="Averchi";
        elementMethods.fillElement(lastNameElement,lastName);

        WebElement passwordElement = Driver.findElement(By.xpath("//input[@type='password']"));
        String passwordValue="fjnfjk";
        passwordElement.sendKeys(passwordValue);

        WebElement dayElement = Driver.findElement(By.id("days"));
        Select dayDropdown = new Select (dayElement);
        dayDropdown.selectByValue("20");
        elementMethods.selectValueElement(dayElement,"20");

        WebElement monthElement = Driver.findElement(By.xpath("//select[@name='months']"));
        Select monthDropdown = new Select(monthElement);
        monthDropdown.selectByValue("2");
        elementMethods.selectValueElement(monthElement,"2");

         WebElement yearElement = Driver.findElement(By.id("years"));
         Select yearDropdown = new Select (yearElement);
         yearDropdown.selectByValue("1991");
         elementMethods.selectValueElement(yearElement,"1991");

        //JavascriptExecutor js = (JavascriptExecutor) Driver;
       // js.executeScript("window.scrollBy(0,250)", "");  //scroll down

        WebElement newsLetterElement = Driver.findElement(By.id("uniform-newsletter"));
        elementMethods.clickElement(newsLetterElement);

        WebElement optinElement = Driver.findElement(By.id("optin"));
        elementMethods.clickElement(optinElement);

        WebElement companyElement = Driver.findElement(By.id("company"));
        String companyValue = "Hub";
        elementMethods.fillElement(companyElement,companyValue);

        WebElement addressElement = Driver.findElement(By.id("address1"));
        String addressValue = "Taietura 11";
        elementMethods.fillElement(addressElement,addressValue);

        WebElement secondAddresseEement = Driver.findElement(By.id("address2"));
        String secondaddressValue = "N/A";
        elementMethods.fillElement(secondAddresseEement,secondaddressValue);

        WebElement cityElement = Driver.findElement(By.id("city"));
        String cityValue = "NY";
        elementMethods.fillElement(cityElement,cityValue);

        WebElement stateElement =Driver.findElement(By.id("id_state"));
        Select stateDropdown = new Select (stateElement);
        stateDropdown.selectByVisibleText("California");
        elementMethods.selectTextElement(stateElement,"Texas");

        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");  //scroll down

        WebElement postcodeElement = Driver.findElement(By.id("postcode"));
        String postcodeValue = "00000";
        elementMethods.fillElement(postcodeElement,postcodeValue);

        WebElement countryElement = Driver.findElement(By.id("id_country"));
        elementMethods.clickElement(countryElement);

        WebElement aditionalInfoElement = Driver.findElement(By.id("other"));
        String infoValue = "Nothing to add";
        elementMethods.fillElement(aditionalInfoElement,infoValue);

        WebElement homePhoneElement = Driver.findElement(By.id("phone"));
        String homePhoneValue = "0756 021 007";
        elementMethods.fillElement(homePhoneElement,homePhoneValue);

        WebElement phoneElement = Driver.findElement(By.id("phone_mobile"));
        String phoneValue = "07482 615 878";
        elementMethods.fillElement(phoneElement,phoneValue);

        WebElement assignAddressElement = Driver.findElement(By.id("alias"));
        String assignaddressValue = "Park Avenue rue 25 ";
        elementMethods.fillElement(assignAddressElement,assignaddressValue);

        WebElement registerElement = Driver.findElement(By.id("submitAccount"));
        elementMethods.clickElement(registerElement);
















    }
}
