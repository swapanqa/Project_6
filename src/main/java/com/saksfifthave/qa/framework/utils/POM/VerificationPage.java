package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class VerificationPage extends WebElementUtils {

    public void verifyBeforeSignIn(){
        String title = driver.getTitle();
        Assert.assertEquals("Designer Women's Apparel, Men's Apparel, Shoes & Handbags - Saks.com", title);

    }
    public void verifyClickingSignIn(){

        String title = driver.getTitle();
        Assert.assertEquals("Saks.com",title);
        // Assert.assertEquals("Saks.com: Designer Women's Apparel, Men's Apparel, Shoes and Handbags, Beauty and More", title);
        delayFor(3000);
    }
    public void succesFullyLogedIn(){
//        String title = driver.getTitle();
//        Assert.assertEquals("Saks.com",title);
        String verifyPageTitle=driver.getCurrentUrl();

        Assert.assertEquals("https://www.saksfifthavenue.com/account/login?_k=%2Faccount%2Fsummary",verifyPageTitle);

    }
    public void incorrectPassword(){
        String incorrectPassword = driver.findElement(By.xpath("//*[@id=\"account-content-area\"]/div/div[1]/div//span")).getText();
        System.out.println("INcorrect////  "+incorrectPassword);

       // Assert.assertEquals("We're sorry, your entry does not match our records. Forgot Password?",incorrectPassword);



    }


}
