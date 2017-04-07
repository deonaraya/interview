package com.interview.learn.sindhu;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;

public class DropdownTest {
    WebDriver driver=new ChromeDriver();
    @Before
    public void setUp()
    {
        driver.manage().window().maximize();
        driver.get("https://www.thesitewizard.com/archive/navigation.shtml");

    }

    @Test
    public void getArea() throws InterruptedException
    {
        System.out.println("Hello1");
        Select make = new Select(driver.findElement(By.id("dummymenu")));
        assertFalse(make.isMultiple());
        System.out.println(make.getOptions().size());//Displays elements number in dropdown box
        make.selectByVisibleText("Home");//To select an option
        Thread.sleep(5000);
        Assert.assertEquals("Home",make.getFirstSelectedOption().getText());
        System.out.println("Hello2");
        //make.deselectByVisibleText("Home");
        Thread.sleep(5000);
        driver.quit();
    }

}


