package com.interview.learn.sindhu;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BmiCalcPage {
    private WebDriver driver ;
    String url="https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm";

    public BmiCalcPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @Before
    public void setUp()
    {

        driver.get("https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/english_bmi_calculator/bmi_calculator.html");
    }

    @FindBy(name="height_feet")
    WebElement heightft;
    @FindBy(name="height_inches")
    WebElement heightin;
    @FindBy(name="your_weight")
    WebElement weight;
    @FindBy(name=".//*[@id='aimtxt']/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td/input")
    WebElement Calculate;
    @FindBy(id="yourbmi")
    WebElement bmi;




    public void setHeightft(String heightfeet)
    {
        heightft.sendKeys(heightfeet);
    }
    public void setHeightin(String heightinch)
    {
        heightin.sendKeys(heightinch);
    }
    public void setWeight(String weightlbs)
    {
        weight.sendKeys(weightlbs);
    }
    public void calculateBMI()
    {
        Calculate.click();
    }
    public String getBmi()
    {
        return bmi.getAttribute("value");
    }
//	public String getBmiCategory()
//	{
//		return bmiCategory.getAttribute("value");
//	}


}
