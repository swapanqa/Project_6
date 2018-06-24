package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.POM.VerificationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageSteps extends StepBase {
    VerificationPage verificationPage = new VerificationPage();

    @When("^User browse to the site$")
    public void browseToSite(){
        driver.navigate().to("https://www.saksfifthavenue.com/Entry.jsp");

    }

    @Then("^User close the popup$")
    public void iframeHome(){
        WebElement popupDialougeBox = null;

        try {
            popupDialougeBox = driver.findElement(By.xpath(".//*[@id='generic-modal']"));
            System.out.println("Found");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        if (popupDialougeBox != null) {

            WebElement emailPopUpContainerIframe = popupDialougeBox.findElement(By.xpath("./iframe"));
            driver.switchTo().frame(emailPopUpContainerIframe);
            System.out.println("Switched");

            WebElement closeButton = driver.findElement(By.xpath("//div[@id='close-button']"));
            closeButton.click();
        }

        delayFor(30);
    }

    @Then("^Saks home page should display$")
    public void saksfifthavenue_home_page_display() throws Throwable {
       /* String title = driver.getTitle();
        Assert.assertEquals("Designer Women's Apparel, Men's Apparel, Shoes & Handbags - Saks.com", title);*/
        verificationPage.verifyBeforeSignIn();

    }
    @When("^User click login link$")
    public void loginLink()
    {
        click(By.xpath(".//*[@id='toolbar']/li[1]/a/span"));
//      WebElement clickButton= driver.findElement(By.xpath("//*[@id=\"account-content-area\"]//div[1]/section/form/div[4]/button/span"));
//      highlight(clickButton);
//      clickButton.click();
    }



    @Then("^Browser display login page$")
    public void browser_display_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }






}
