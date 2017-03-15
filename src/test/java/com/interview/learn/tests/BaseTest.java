package com.interview.learn.tests;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;

/**
 * Created by chandrad on 3/10/17.
 */
public class BaseTest {

    WebDriver driver ;

    Logger LOGGER = LogManager.getLogger(BaseTest.class);

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser){


        if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","/Users/chandrad/Documents/DeoTrainings/Interviews/src/main/resources/geckodriver");
            driver = new FirefoxDriver() ;
        }

        else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/chandrad/Documents/DeoTrainings/Interviews/src/main/resources/chromedriver");
            driver = new ChromeDriver() ;
        }

        else {
            throw new IllegalArgumentException("Invalid browser value!!");
        }
    }

    @AfterMethod
    public void teardown(ITestResult result){

        if(result.getStatus()==ITestResult.FAILURE)
        {

            try {
                TakesScreenshot ts =(TakesScreenshot)driver;

                // Call method to capture screenshot  // save ctrl+ s
                File source= ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));

                LOGGER.info("Screenshot taken in case of failure");

            } catch (Exception e) {
               LOGGER.error("Exception while taking screenshot "+e.getMessage());
            }
        }

        driver.close();
        driver.quit();

    }
}
