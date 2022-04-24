package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    public WebElement loginInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = ".//button[@data-test='signin-submit']")
    public WebElement singInButton;

    public String fullUrl;

    public LoginPage() {
        super();
        this.fullUrl = baseUrl.concat("/signin");
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this);
    }

    public void logIn (String username, String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }
}
