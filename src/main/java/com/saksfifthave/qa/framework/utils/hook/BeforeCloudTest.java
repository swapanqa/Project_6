package com.saksfifthave.qa.framework.utils.hook;

import com.saksfifthave.qa.framework.utils.Utils.DriverFactory;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BeforeCloudTest {
    protected WebDriver driver;







    @Parameterized.Parameter()
    public String browserName = "chrome";

    @Before
    public void beforeMethod() throws Exception {

        driver = DriverFactory.getInstance(browserName).getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);




    }

    
}
