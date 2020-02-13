package com.cybertek.tests.day12_actions_jsExecutor;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactor.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
       driver.quit();

    }

     @Test
    public void Click() {
         driver.get("http://practice.cybertekschool.com/");


         WebElement link = driver.findElement(By.linkText("Dropdown"));
         // create jsExecutor object and run the code with that object

         // how to create jsExecutor object

         JavascriptExecutor jse = (JavascriptExecutor) driver;

         jse.executeScript("arguments[0].click();", link);


     }


     @Test
     public void type() {

         driver.get("http://practice.cybertekschool.com/dynamic_controls");

         WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));

         JavascriptExecutor jse = (JavascriptExecutor) driver;

         String str = "hello disable inputBox";

         jse.executeScript("arguments[0].setAttribute('value','" + str + "')", inputBox);

     }


     @Test
     public void Scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse=(JavascriptExecutor) driver;


        // frist scroll down
         for (int i = 0; i < 10; i++) {
              Thread.sleep(500);
             jse.executeScript("window.scrollBy(0,250)");

         }
         Thread.sleep(5000);


         // then scroll up ( you have to put "-" in the code )

         for (int i = 0; i < 5; i++) {
             Thread.sleep(500);
             jse.executeScript("window.scrollBy(0,-250)");

         }
         

}


















}
