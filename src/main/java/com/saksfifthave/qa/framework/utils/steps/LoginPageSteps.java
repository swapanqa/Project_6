package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.POM.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageSteps extends StepBase {


    @When("^User enter user email as \"([^\"]*)\"$")


    public void user_enter_user_email_as(String email) {
        WebElement userEmail= driver.findElement(By.xpath("//*[@id=\"sign-into-account-email-field\"]"));
        highlight(userEmail);
        userEmail.sendKeys(email);
    }


    @When("^User enter password as \"([^\"]*)\"$")
    public void loginPassword(String password){

        WebElement passWord=driver.findElement(By.xpath("//*[@id=\"sign-into-account-password-field\"]"));
        highlight(passWord);
        passWord.sendKeys(password);

    }

    @Then("^User click login button$")
    public void clickLoginButton() {
//        WebElement clickButton= driver.findElement(By.xpath("//*[@id=\"account-content-area\"]//div[1]/section/form/div[4]/button/span"));
//        highlight(clickButton);
//        clickButton.click();
        click(By.xpath("//*[@id=\"account-content-area\"]//div[1]/section/form/div[4]/button/span"));
    }



    @Then("^Login succesfull message display$")
    public void loginSuccess(){

        String loginVerify = driver.findElement(By.className("loggedin-user-utils__message-welcome")).getText();
        //String loginVerify = driver.findElement(By.className("loggedout-user-utils__welcome-label")).getText();

        System.out.println(loginVerify);
        //Assert.assertEquals("Welcome, Sign In",loginVerify);
//Assert.assertTrue("Welcome",loginVerify.startsWith("Welcome"));
        Assert.assertNotEquals("Welcome, Sign In",loginVerify);
    }



    @When("^Forgotten password message display$")
    public void forgottenPasswordDisplay(){
        String incorrectPassword = driver.findElement(By.xpath("//*[@id=\"account-content-area\"]/div/div[1]/div//span")).getText();
        System.out.println("INcorrect////  "+incorrectPassword);

        Assert.assertEquals("We're sorry, your entry does not match our records. Forgot Password?",incorrectPassword);


    }

}




