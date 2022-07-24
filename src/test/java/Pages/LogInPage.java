package Pages;

import Help.ElementMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public LogInPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement emailElement;
    @FindBy(id = "passwd")
    public WebElement passwordElement;
    @FindBy(id = "SubmitLogin")
    public WebElement enterElement;
    @FindBy(xpath = "//p[text()='There is 1 error']")
    public WebElement errorMessageElement;



    public void loginInValidProcess(String page, String email, String password,String error){
        pageMethods.validateTitlePage(page);
        elementMethods.fillElement(emailElement, email);
        elementMethods.fillElement(passwordElement, password);
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorMessageElement, error);
    }
}

