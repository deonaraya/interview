package com.interview.learn.sindhu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebElement;

//import java.util.List;

public class testMultiSelection {
    WebDriver driver=new ChromeDriver();
    @Before
    public void setUp()
    {
        driver.manage().window().maximize();
        driver.get("https://semantic-ui.com/modules/dropdown.html");

    }

    @Test
    public void getArea() throws InterruptedException
    {
        System.out.println("Hello1");
        Select make = new Select(driver.findElement(By.name("skills")));
        System.out.println(make.isMultiple());
        Assert.assertTrue(make.isMultiple());
        //System.out.println(make.getOptions());
        //List<WebElement> select_webelements = make.getOptions();
//		for(WebElement x: select_webelements){
//			System.out.println(x.getText());
//		}
        System.out.println("Hello2");

        //Select make2 = new Select(driver.findElement(By.name("skills")));
        make.selectByValue("python");
        System.out.println(make.getAllSelectedOptions());
        System.out.println("Hello3");
        Thread.sleep(30);
        driver.quit();
    }

}
