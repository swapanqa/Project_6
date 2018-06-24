package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends WebElementUtils {

  public void loginLink()
  {
      click(By.xpath(".//*[@id='toolbar']/li[1]/a/span"));
//      WebElement clickButton= driver.findElement(By.xpath("//*[@id=\"account-content-area\"]//div[1]/section/form/div[4]/button/span"));
//      highlight(clickButton);
//      clickButton.click();
  }
  public void displayLoginPage()
  {
      String verifyPageTitle=driver.getCurrentUrl();

      Assert.assertEquals("https://www.saksfifthavenue.com/account/login?_k=%2Faccount%2Fsummary",verifyPageTitle);
      System.out.println("PageTitle    "+verifyPageTitle);
  }

  public void loginEmail(String email){
      WebElement userEmail= driver.findElement(By.xpath("//*[@id=\"sign-into-account-email-field\"]"));
      highlight(userEmail);
      userEmail.sendKeys(email);
  }
  public void loginPassword(String password){

      WebElement passWord=driver.findElement(By.xpath("//*[@id=\"sign-into-account-password-field\"]"));
      highlight(passWord);
      passWord.sendKeys(password);

  }
    public void clickLoginButton() {
        WebElement clickButton= driver.findElement(By.xpath("//*[@id=\"account-content-area\"]//div[1]/section/form/div[4]/button/span"));
        highlight(clickButton);
        clickButton.click();
    }


    public void loginSuccess(){

      String loginVerify = driver.findElement(By.className("loggedin-user-utils__message-welcome")).getText();
      //String loginVerify = driver.findElement(By.className("loggedout-user-utils__welcome-label")).getText();

      System.out.println(loginVerify);
      //Assert.assertEquals("Welcome, Sign In",loginVerify);
//Assert.assertTrue("Welcome",loginVerify.startsWith("Welcome"));
      Assert.assertNotEquals("Welcome, Sign In",loginVerify);
  }

    public void inCorrectPassword(String Password) {
        WebElement passWord=driver.findElement(By.xpath("//*[@id=\"sign-into-account-password-field\"]"));
        highlight(passWord);
        passWord.sendKeys(Password);
    }
    public void forgottenPasswordDisplay(){
        String incorrectPassword = driver.findElement(By.xpath("//*[@id=\"account-content-area\"]/div/div[1]/div//span")).getText();
        System.out.println("INcorrect////  "+incorrectPassword);

        Assert.assertEquals("We're sorry, your entry does not match our records. Forgot Password?",incorrectPassword);


    }
















   public void browserDisplaySignIn(){
       String title = driver.getTitle();
       Assert.assertEquals("Saks.com", title);
   }
   public void userClickSignInLink(){
       click(By.xpath(".//*[@id='toolbar']/li[1]/a/span"));
   }
   public void userEnterEmail(String email){
       typeText(By.id("sign-into-account-email-field"), email);
   }
   public void userEnterPassword(String password){
       typeText(By.id("sign-into-account-password-field"), password);
   }
   public void userClickSignIn(){
       click(By.xpath("//button[contains(@class,'sign-into-account')]"));

   }
}
