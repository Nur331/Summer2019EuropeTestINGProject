package com.cybertek.tests.day7_testNG;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {


@Test
    public void radioButton(){

    WebDriver driver= WebDriverFactor.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/radio_buttons");

    WebElement blueButton=driver.findElement(By.id("blue"));
    WebElement redButton=driver.findElement(By.id("red"));
    System.out.println("Is blue selected?= " +   blueButton.isSelected());
    System.out.println("Is red selected?= " +   redButton.isSelected());

    Assert.assertTrue(blueButton.isSelected(), "verify that blue button is selected ");
    Assert.assertFalse(redButton.isSelected(), "verify that red button is selected ");

    redButton.click();
    System.out.println("clicking on red button");

    Assert.assertFalse(blueButton.isSelected(),"blue is not selected");
    Assert.assertTrue(redButton.isSelected(),"red is selected");

    System.out.println("blue is selected = " + blueButton.isSelected());
    System.out.println("red is selected = " + redButton.isSelected());

    driver.quit();

}





























}
