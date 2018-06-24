package com.saksfifthave.qa.framework.utils.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutSteps extends StepBase {




    @Then("^User click Check out button$")
    public void clickCheckOutButton() {
//        WebElement checkOutButton=driver.findElement(By.xpath("//*[@id=\"minibag-wrapper\"]//div[2]/a"));
//        highlight(checkOutButton);
//        checkOutButton.click();
        waitForElement(By.xpath("//*[@id=\"minibag-wrapper\"]//div[2]/a"),30).click();
    }
    @Then("^Browser display Check out Page$")
    public void displayCheckOutPage(){
        String checkoutPage=driver.getCurrentUrl();
        Assert.assertEquals("https://www.saksfifthavenue.com/checkout/SaksBag.jsp#init0",checkoutPage);

        System.out.println("check out page  verification   "+checkoutPage);
    }


}
