package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginPage;
import pom.MainPage;

public class LoginStepdefs {
    private LoginPage loginPage = new LoginPage();
    private MainPage mainPage = new MainPage();

    @Given("login page is loaded")
    public void loginPageIsLoaded() {
        loginPage.driver.get(loginPage.fullUrl);
    }

    @When("user provide correct {string} and {string}")
    public void userProvideCorrectAnd(String username, String password) {
        loginPage.logIn(username, password);
    }

    @And("login button is clicked")
    public void loginButtonIsClicked() {
        loginPage.singInButton.click();
    }

    @Then("main page should be loaded")
    public void mainPageShouldBeLoaded() {
        mainPage.mainForm.isDisplayed();
    }
}
