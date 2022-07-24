package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {

        super(driver);

    }

    //elementele specifice acestei pagini
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInElement;


    //metodele specifice acestei clase
    public void clickSignIn() {
        elementMethods.clickElement(signInElement);


    }

}


