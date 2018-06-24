package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShipToAbroad extends WebElementUtils {


public void clickShipToLink(){
    WebElement shipTo= driver.findElement(By.xpath("//*[@id=\"toolbar\"]/li[2]/a/span"));
    highlight(shipTo);
    shipTo.click();
}
public void verifyShipToPage()
{
    String shipToPage = driver.getTitle();
    System.out.println("shipToPage   "+shipToPage);
    Assert.assertEquals("Women's & Men's Designer Apparel, Shoes, Handbags & More | Gucci, Prada, Burberry, Juicy Couture, more - saks.com",shipToPage);
}
public void selectCountry()
{
    //WebElement country= driver.findElement(By.id("INTCOUNTRY"));
   // highlight(country);
   // country.click();

    WebElement element = driver.findElement(By.id("INTCOUNTRY"));
    Select select = new Select(element);
    select.selectByValue("BD");


}
public void saveContinue()
{
    WebElement sContinue= driver.findElement(By.name("update"));
    sContinue.click();
}



}
