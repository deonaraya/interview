package com.interview.learn.sindhu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testRadioButton {
    WebDriver driver=new ChromeDriver();
    @Before
    public void setUp()
    {
        driver.manage().window().maximize();
        driver.get("http://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");

    }

    @Test
    public void testRadio() throws InterruptedException
    {
        WebElement petrol=driver.findElement(By.name("Excel"));
        System.out.println("1");
        petrol.click();
        if(!petrol.isSelected())
        {
            petrol.click();
        }
        System.out.println("2");
        Assert.assertTrue(petrol.isSelected());
        Thread.sleep(3000);

        System.out.println("3");
        List<WebElement> fuel=driver.findElements(By.name("software"));
        for(WebElement type:fuel)
        {
            if(type.getAttribute("value").equals("Peachtree"))
            {
                if(!type.isSelected())
                {
                    type.click();
                }
            }
        }
        System.out.println("4");
        Thread.sleep(5000);
        driver.quit();
    }

}
