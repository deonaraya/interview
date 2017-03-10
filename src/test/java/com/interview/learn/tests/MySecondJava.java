package com.interview.learn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/9/17.
 */
public class MySecondJava extends BaseTest {


    // with TESTNG we do not need main method ... TESTNG is a open source library ...
    // we can execute any methods that are annotated with @TEST annotations ...

    @Test(priority = 0)
    public void testThree(){

        driver.get("http://myntra.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));

    }

    @Test(priority = 1)
    public void testFour(){

        driver.get("http://yahoo.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Yahoo"));


    }




}
