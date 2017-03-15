package com.interview.learn.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/9/17.
 */
public class MyFirstJava extends BaseTest {


    // initialize the LOGGER instance ..
    static final Logger LOGGER = LogManager.getLogger(BaseTest.class);


    // with TESTNG we do not need main method ... TESTNG is a open source library ...
    // we can execute any methods that are annotated with @TEST annotations ..


    @Test
    public void testOne(){

        driver.get("http://automationpractice.com/index.php");
     //   System.out.println("opening the URL in the browser");
        LOGGER.info("opening the URL in the browser");
//        LOGGER.error("error message");
//        LOGGER.trace("tracing");
//        LOGGER.debug("debugging");

        String title = driver.getTitle() ;
     //   System.out.println("storing the title of webpage in a String varialbe named title");
        LOGGER.info("storing the title of webpage in a String varialbe named title");

        Assert.assertTrue(title.contains("Store"));
        LOGGER.info("Asserting on the title of the page");


    }

    @Test
    public void testTwo(){

        driver.get("http://amazon.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Should FAIL"));


    }




}
