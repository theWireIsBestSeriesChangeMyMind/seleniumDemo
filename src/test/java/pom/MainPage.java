package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = ".//main[@data-test='main']")
    public WebElement mainForm;
    public String fullUrl;

    public MainPage() {
        super();
        this.fullUrl = baseUrl;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this);
    }
}
