package com.cybertek.tests.day7_testNG;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DIsableElementTest {


    @Test

    public void test1() {
        WebDriver driver = WebDriverFactor.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioButton = driver.findElement(By.id("green"));

        System.out.println("is  element enable?" + greenRadioButton.isEnabled());
        Assert.assertFalse(greenRadioButton.isEnabled(), "verify that green button is disable");

        greenRadioButton.click();
    }


@Test

public void test2(){

    WebDriver driver = WebDriverFactor.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://practice.cybertekschool.com/dynamic_controls");

    WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

    System.out.println("is input enable:"+inputBox.isEnabled());

     // inputBox.sendKeys("smith john");

      driver.quit();
}




}
