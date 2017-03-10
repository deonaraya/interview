package com.interview.learn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/9/17.
 */
public class MyFirstJava extends BaseTest {


    // with TESTNG we do not need main method ... TESTNG is a open source library ...
    // we can execute any methods that are annotated with @TEST annotations ..


    @Test
    public void testOne(){

        driver.get("http://automationpractice.com/index.php");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Store"));

    }

    @Test
    public void testTwo(){

        driver.get("http://amazon.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));


    }




}
