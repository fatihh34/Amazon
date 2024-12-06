package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;

public class AmazonStepDef {

    HomePage homePage= new HomePage();

    @When("user goes the page")
    public void user_goes_the_page() {
        Hooks.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @Then("user closed cookies")
    public void userClosedCookies() {
        homePage.cookiesClosed.click();
    }
}
