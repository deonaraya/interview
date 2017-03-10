package com.interview.learn.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by chandrad on 3/10/17.
 */
public class BaseTest {

    WebDriver driver ;


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
    public void teardown(){
        driver.close();
        driver.quit();

    }
}
