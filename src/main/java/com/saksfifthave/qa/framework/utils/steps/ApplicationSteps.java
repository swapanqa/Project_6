package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.POM.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationSteps extends StepBase {
    HomePage homePage = new HomePage();

    @Given("^Not a validated user$")
    public void not_a_validated_user() throws Throwable {
       // homePage.notAValidUser();

    }

    @When("^user borwse to the site$")
    public void user_borwse_to_the_site() throws Throwable {
       homePage.browseToSite();
    }

    @Then("^user close pop up$")
    public void user_close_pop_up() throws Throwable {
    homePage.iframeHome();
    }
}
