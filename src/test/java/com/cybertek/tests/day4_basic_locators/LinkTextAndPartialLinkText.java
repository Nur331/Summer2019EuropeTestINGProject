package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactor.getDriver("chrome");
        driver.manage().window().maximize();

driver.get("http://practice.cybertekschool.com/dynamic_loading");

WebElement link3= driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));

link3.click();

        Thread.sleep(10000);
        driver.close();

        // azy way to click home button
        driver.findElement(By.linkText("Home")).click();


// or
//WebElement link6= driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));
//link6.click();
      //  Thread.sleep(10000);
        //driver.close();


        // or partial link text locator
//WebElement link5 = driver.findElement(By.partialLinkText("Example 5:"));

//  link5.click();




    }
}
