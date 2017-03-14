package com.interview.learn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/14/17.
 */
public class MyThirdJava extends BaseTest {


    @Test
    public void testsix(){

        driver.get("http:/jabong.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));

    }

    @Test
    public void testFive(){

        driver.get("http://flipkart.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));


    }
}
