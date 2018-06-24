package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ShoppingCartPage extends WebElementUtils {


    public void clickMenWear()  {
        WebElement men=driver.findElement(By.xpath("//div//li[7]/a/span"));
        highlight(men);
        men.click();
    }
    public void displayMenPage() {
        String menPage=driver.getCurrentUrl();
        Assert.assertEquals("https://www.saksfifthavenue.com/main/SectionPage.jsp?catId=2534374306418052&FOLDER%3C%3Efolder_id=2534374306418052",menPage);
        //System.out.println("menPage url"+menPage);
    }

    public void clickMenFromCatagory() {
        WebElement clickJeans= driver.findElement(By.xpath("//*[@id=\"landing-page-navigation\"]//div[2]//li[6]/a"));
        highlight(clickJeans);
        clickJeans.click();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void displayMenWearList(){

        String jeansPage =driver.getTitle();
        System.out.println("Jeans Category page    "+jeansPage);
        Assert.assertEquals("Jeans For Men | Saks.com",jeansPage);


    }
    public void clickPaige() {
        WebElement jeansElement = driver.findElement(By.id("img_0400097299221-0"));
        highlight(jeansElement);

        scrollToElement(jeansElement);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jeansElement.click();
    }

    public void displayPaigeSizePage(){
        String jeansSizePage=driver.getTitle();
        Assert.assertEquals("PAIGE - Croft Washed Skinny Jeans - saks.com",jeansSizePage);

        System.out.println("JeansSizeTitlePage  "+jeansSizePage);
    }
    public void clickSize_28()  {
        WebElement selectSize=driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//li[1]/span"));
        highlight(selectSize);
        selectSize.click();
    }
    public void incraseQuantity() {
        WebElement qantityButton= driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//button[2]"));
        highlight(qantityButton);
        qantityButton.click();
    }
    public void clickAddToBag() {
        WebElement addTobag= driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//div[5]//div[1]/div//button"));
        highlight(addTobag);
        addTobag.click();

        String shoppingBagPage=driver.getCurrentUrl();
        System.out.println("shoping    "+shoppingBagPage);

    }
    public void displayShoppingBag() {
        String shoppingBagPage=driver.getCurrentUrl();
        System.out.println("shoping    "+shoppingBagPage);
    }


}
