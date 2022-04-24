package pom;

import Hooks.Hooks;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;
    public String baseUrl;

    public BasePage() {
        this.driver = Hooks.driver;
        this.baseUrl = "http://localhost:3000";
    }
}
