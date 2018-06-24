package com.saksfifthave.qa.framework.utils.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShipToAbroadSteps extends StepBase{

    @When("^User click ShipTo link$")
    public void clickShipToLink()
    {
//        WebElement shipTo= driver.findElement(By.xpath("//*[@id=\"toolbar\"]/li[2]/a/span"));
//        highlight(shipTo);
//        shipTo.click();
        click(By.xpath("//*[@id=\"toolbar\"]/li[2]/a/span"));
    }



    @Then("^ShipTo page display$")
    public void verifyShipToPage()
    {
        String shipToPage = driver.getTitle();
        System.out.println("shipToPage   "+shipToPage);
        Assert.assertEquals("Women's & Men's Designer Apparel, Shoes, Handbags & More | Gucci, Prada, Burberry, Juicy Couture, more - saks.com",shipToPage);
    }

    @Then("^User select country$")
    public void selectCountry()
    {
        WebElement element = driver.findElement(By.id("INTCOUNTRY"));
        Select select = new Select(element);
        select.selectByValue("BD");
    }

    @Then("^User click save and continue$")
    public void saveContinue()
    {
//        WebElement sContinue= driver.findElement(By.name("update"));
//        sContinue.click();
        click(By.name("update"));
    }


}
