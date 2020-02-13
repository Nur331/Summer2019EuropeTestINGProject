package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemo {

    @Test
    public void test1() throws InterruptedException {


        WebDriver driver= WebDriverFactor.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput=driver.findElement(By.id("username"));
        System.out.println(usernameInput.isDisplayed());

        Assert.assertFalse(usernameInput.isDisplayed(), "verify that username inputbox is not display");

        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        Thread.sleep(7000);

        System.out.println(usernameInput.isDisplayed());
        Assert.assertTrue(usernameInput.isDisplayed(), " verify that username is not display");
        driver.quit();
    }


}
