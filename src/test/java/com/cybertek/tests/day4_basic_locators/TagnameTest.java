package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) {
        WebDriver  driver= WebDriverFactor.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");


        WebElement fullnameInput = driver.findElement(By.tagName("input"));
fullnameInput.sendKeys("MIke Smith with tagname");

        WebElement emailInput = driver.findElement(By.name("email"));
   emailInput.sendKeys("mike@gmail.comx");


   WebElement  signUpbotton= driver.findElement(By.tagName("button"));
signUpbotton.click();


     //System.out.println(driver.findElement(By.tagName("h3")).getText());
// same codes here under as line 29
      WebElement messageElement = driver.findElement(By.tagName("h3"));

      String message = messageElement.getText();

      System.out.println(message);










    }



}
