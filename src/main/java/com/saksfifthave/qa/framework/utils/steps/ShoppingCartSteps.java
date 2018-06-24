package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.POM.ShoppingCartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartSteps extends StepBase {

//ShoppingCartPage shoppingCartPage=new ShoppingCartPage();



    @When("^User click on MenWear$")
    public void clickMenWear()  {
//        WebElement men=driver.findElement(By.xpath("//div//li[7]/a/span"));
//        highlight(men);
//        men.click();
        click(By.xpath("//div//li[7]/a/span"));
    }
    @Then("^Browser display Men page$")
    public void displayMenPage() {
        String menPage=driver.getCurrentUrl();
        Assert.assertEquals("https://www.saksfifthavenue.com/main/SectionPage.jsp?catId=2534374306418052&FOLDER%3C%3Efolder_id=2534374306418052",menPage);
        //System.out.println("menPage url"+menPage);



            WebElement popupDialougeBox = null;

            try {
                popupDialougeBox = driver.findElement(By.className("kpl-invitation-content"));
                System.out.println("Found");

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            if (popupDialougeBox != null) {

                WebElement emailPopUpContainerIframe = popupDialougeBox.findElement(By.xpath("./iframe"));
                driver.switchTo().frame(emailPopUpContainerIframe);
                System.out.println("Switched");

                WebElement closeButton = driver.findElement(By.id("kplDeclineButton"));
                closeButton.click();
            }

            delayFor(30);
        }








    @When("^User click Menwear from caragory$")

    public void clickMenFromCatagory() {
//        WebElement clickJeans= driver.findElement(By.xpath("//*[@id=\"landing-page-navigation\"]//div[2]//li[6]/a"));
//        highlight(clickJeans);
//        clickJeans.click();
        click(By.xpath("//*[@id=\"landing-page-navigation\"]//div[2]//li[6]/a"));


    }
    @Then("^Browser display men wear list$")
    public void displayMenWearList(){

        String jeansPage =driver.getTitle();
        System.out.println("Jeans Category page    "+jeansPage);
        Assert.assertEquals("Jeans For Men | Saks.com",jeansPage);


    }
    @Then("^User click Paige$")
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
    @Then("^Browser display PaigeSizePage$")
    public void displayPaigeSizePage(){
        String jeansSizePage=driver.getTitle();
        Assert.assertEquals("PAIGE - Croft Washed Skinny Jeans - saks.com",jeansSizePage);

        System.out.println("JeansSizeTitlePage  "+jeansSizePage);

    }
    @Then("^User click Size_twenty_eight$")
    public void clickSize_28()  {WebElement selectSize=driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//li[1]/span"));
//        highlight(selectSize);
//        selectSize.click();
        click(By.xpath("//*[@id=\"pdp-content-area\"]//li[1]/span"));
    }
    @Then("^User click quantity button to incrase$")
    public void incraseQuantity() {
//        WebElement qantityButton= driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//button[2]"));
//        highlight(qantityButton);
//        qantityButton.click();
        click(By.xpath("//*[@id=\"pdp-content-area\"]//button[2]"));
    }
    @Then("^User click Add To Bag$")
    public void clickAddToBag() {
//        WebElement addTobag= driver.findElement(By.xpath("//*[@id=\"pdp-content-area\"]//div[5]//div[1]/div//button"));
//        highlight(addTobag);
//        addTobag.click();
        click(By.xpath("//*[@id=\"pdp-content-area\"]//div[5]//div[1]/div//button"));

        String shoppingBagPage=driver.getCurrentUrl();
        System.out.println("shoping    "+shoppingBagPage);

    }
    @Then("^Browser display shopping bag$")
    public void displayShoppingBag() {
        String shoppingBagPage=driver.getCurrentUrl();
        System.out.println("shoping    "+shoppingBagPage);
    }



}
