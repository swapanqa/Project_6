package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.POM.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoPage extends StepBase{
    HomePage homePage= new HomePage();




//    @When("^User browse to the site$")
//    public void user_browse_to_the_site() {
//
//
//    }
//
//    @Then("^User close the popup$")
//    public void user_close_the_popup() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^Saks home page should display$")
//    public void saks_home_page_should_display() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^User click login link$")
//    public void user_click_login_link() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^Browser display login page$")
//    public void browser_display_login_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//
//
//
//
//
//    @Then("^Login succes message display$")
//    public void loginSuccess(){
//
//        String loginVerify = driver.findElement(By.className("loggedin-user-utils__message-welcome")).getText();
//        //String loginVerify = driver.findElement(By.className("loggedout-user-utils__welcome-label")).getText();
//
//        System.out.println(loginVerify);
//        //Assert.assertEquals("Welcome, Sign In",loginVerify);
////Assert.assertTrue("Welcome",loginVerify.startsWith("Welcome"));
//        Assert.assertNotEquals("Welcome, Sign In",loginVerify);
//    }
//
//    @When("^User enter incorrect password as \"([^\"]*)\"$")
//    public void inCorrectPassword(String Password) {
//        WebElement passWord=driver.findElement(By.xpath("//*[@id=\"sign-into-account-password-field\"]"));
//        highlight(passWord);
//        passWord.sendKeys(Password);
//    }
//
//





}
