package com.saksfifthave.qa.framework.utils.steps;

import com.saksfifthave.qa.framework.utils.Utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class BeforeAfterHook extends StepBase {
    @Before
    public void setup() {
       // ChromeDriverManager.getInstance().setup();
       // driver = new ChromeDriver();

        //DriverFactory.getInstance().getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();

        DriverFactory.getInstance().removeDriver();
    }

}
