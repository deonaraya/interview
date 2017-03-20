package com.interview.learn.tests;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/9/17.
 */
public class MySecondJava extends BaseTest {


    // with TESTNG we do not need main method ... TESTNG is a open source library ...
    // we can execute any methods that are annotated with @TEST annotations ...

    @Test
    public void testThree(){

        test.get().log(Status.INFO,"opening myntra and asserting");

        driver.get("http://myntra.com");

        String title = driver.getTitle() ;

        test.get().log(Status.INFO, "getting the browser title");

        Assert.assertTrue(title.contains("Shop FAIL"));

    }

    @Test
    public void testFour(){

        test.get().log(Status.INFO,"opening yahoo and asserting");

        driver.get("http://yahoo.com");

        String title = driver.getTitle() ;

        test.get().log(Status.INFO, "getting the browser title");

        Assert.assertTrue(title.contains("Yahoo"));

    }




}
