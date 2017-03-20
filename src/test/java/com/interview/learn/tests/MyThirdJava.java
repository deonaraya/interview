package com.interview.learn.tests;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chandrad on 3/14/17.
 */
public class MyThirdJava extends BaseTest {


    @Test
    public void testsix(){

        test.get().log(Status.INFO,"opening jabong and asserting");

        driver.get("http:/jabong.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));

        test.get().log(Status.PASS, "Title verified");

    }

    @Test
    public void testFive(){

        test.get().log(Status.INFO,"opening flipkart and asserting");

        driver.get("http://flipkart.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Ssswhop"));

        test.get().log(Status.PASS, "Title verified");


    }
}
