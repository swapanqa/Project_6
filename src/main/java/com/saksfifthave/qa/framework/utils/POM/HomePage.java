package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends WebElementUtils {

    @FindBy(how = How.XPATH, using =".//*[@id='toolbar']/li[1]/a/span" )
    private WebElement signInLink;


    public void browseToSite(){
        driver.navigate().to("https://www.saksfifthavenue.com/Entry.jsp");

    }

    public void navigateToSignInPage(){
        signInLink.click();
    }
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
    public void iframeMain(){
        List<WebElement> iFrameList = driver.findElements(By.xpath("//iframe"));
        for(WebElement iframe: iFrameList) {
            if(iframe.getAttribute("src").contains("/email_popup/EML1145Acollect.jsp")) {
                driver.switchTo().frame(iframe);
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\"close-button\"]")).click();


    }



}
