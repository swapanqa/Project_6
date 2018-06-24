package com.saksfifthave.qa.framework.utils.POM;

import com.saksfifthave.qa.framework.utils.Utils.DriverFactory;
import com.saksfifthave.qa.framework.utils.steps.WebElementUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class ScriptCompositeSaks {
    protected WebDriver driver;
    protected WebElementUtils webElementUtils;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected VerificationPage verificationPage;
    protected ShoppingCartPage shoppingCartPage;
    protected ShipToAbroad shipTo;
    protected CheckOutPage checkOutPage;

    @Parameterized.Parameter()
    public String browserName = "chrome";

    @Before
    public void beforeMethod() throws Exception {
        System.out.println("Browser: " + browserName);
        driver = DriverFactory.getInstance(browserName).getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        webElementUtils = new WebElementUtils();
        homePage = new HomePage();
        loginPage = new LoginPage();
        verificationPage = new VerificationPage();
        shoppingCartPage = new ShoppingCartPage();
        shipTo=new ShipToAbroad();
        checkOutPage=new CheckOutPage();


        driver.navigate().to("https://www.saksfifthavenue.com/Entry.jsp");

    }

    @After
    public void afterMethod(){

        webElementUtils = null;
        homePage = null;
        loginPage = null;
        verificationPage= null;
        shoppingCartPage = null;
        shipTo=null;
        checkOutPage=null;
        DriverFactory.getInstance().removeDriver();
    }

    public void delayFor(int timeInMili){
        //spree.getUtils().delayFor(timeInMili);
        homePage.delayFor(timeInMili);
    }

    @Parameterized.Parameters(name = "{index} - Browser - {0}")
    public static Collection<Object[]> browsers(){
        return Arrays.asList(new Object[][]{
                {"chrome"},
                {"firefox"},
                {"cloud_chrome_64"},
                {"cloud_ie_11"}
        });
    }

}
