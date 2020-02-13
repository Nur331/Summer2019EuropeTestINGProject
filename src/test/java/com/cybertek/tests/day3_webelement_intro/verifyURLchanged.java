package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
/**
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password links to
 * enter any email
 * click on Retrieve password
 * verify that url changed to http://practice.cybertekschool.com/email_sent
 */



     public static void main(String[] args) {

         // open the chrome
         WebDriver driver = WebDriverFactor.getDriver("chrome");


         // go to http://practice.cybertekschool.com/forgot_password links to an external
         driver.get("http://practice.cybertekschool.com/forgot_password");


         // enter any email
         WebElement emailInput = driver.findElement(By.name("email"));


         // send keys ()-->  send keyboard actions to webelement / enters given text
         emailInput.sendKeys("email@gmail.com");


         // locate to password button
         WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
         retrievePasswordButton.click();

         String expectedUrl = "http://practice.cybertekschool.com/email_sent";
         String actualUrl = driver.getCurrentUrl();

         if (expectedUrl.equals(actualUrl)) {
             System.out.println("PASS");

         } else {
             System.out.println("FAIL");
             System.out.println("actualUrl = " + actualUrl);
             System.out.println("expectedUrl =" + expectedUrl);
         }


         //  close the browser
         driver.quit();


     }



















    }


