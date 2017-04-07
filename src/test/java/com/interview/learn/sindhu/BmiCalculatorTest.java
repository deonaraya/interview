package com.interview.learn.sindhu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BmiCalculatorTest {
    private WebDriver driver;
    @Before
    public void setUp()
    {
        driver = new ChromeDriver() ;
        driver.get("https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/english_bmi_calculator/bmi_calculator.html");
    }

    @Test
    public void bmiTest()
    {
        BmiCalcPage bmiCalcPage=new BmiCalcPage(driver);
        bmiCalcPage.setHeightft("5");
        bmiCalcPage.setHeightin("5");
        bmiCalcPage.setWeight("60");
        bmiCalcPage.calculateBMI();
        Assert.assertEquals("21.0",bmiCalcPage.getBmi());
    }

    @After
    public void tearDown() throws Exception
    {
        driver.quit();
    }



}
