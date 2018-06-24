package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends WebElementUtils {



    public void clickCheckOutButton() {
//        WebElement checkOutButton=driver.findElement(By.xpath("//*[@id=\"minibag-wrapper\"]//div[2]/a"));
//        highlight(checkOutButton);
//        checkOutButton.click();
        click(By.xpath("//*[@id=\"minibag-wrapper\"]//div[2]/a"));
    }
    public void displayCheckOutPage(){
        String checkoutPage=driver.getCurrentUrl();
        Assert.assertEquals("https://www.saksfifthavenue.com/checkout/SaksBag.jsp#init0",checkoutPage);

        System.out.println("check out page  verification   "+checkoutPage);
    }


}
