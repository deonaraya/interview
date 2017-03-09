package com.interview.learn.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by chandrad on 3/9/17.
 */
public class MyFirstJava {


    // with TESTNG we do not need main method ... TESTNG is a open source library ...
    // we can execute any methods that are annotated with @TEST annotations ...

    WebDriver driver ;


    @BeforeMethod
    public void setUp(){

        driver = new FirefoxDriver() ;

        // set path for your chrome driver which is available on net
        //driver = new ChromeDriver() ;

    }


    @Test
    public void testOne(){

        driver.get("http://automationpractice.com/index.php");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Chandra"));

    }

    @Test
    public void testTwo(){

        driver.get("http://amazon.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));


    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();

    }




}
