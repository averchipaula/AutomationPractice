package Pages;

import Help.ElementMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
   // public AlertMethods alertMethods;
   // public TabMethods tabMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
       // alertMethods = new AlertMethods(this.driver);
       // tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(driver, this);
    }
}
