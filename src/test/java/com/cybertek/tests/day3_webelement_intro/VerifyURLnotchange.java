package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class VerifyURLnotchange {
    /**
     * verify URL not changed
     * open chrome browser
     * go to https://practice.cybertekschool.com/forgot_password links to an external
     * click on Retrieve password
     * verify that url did not change
     */


    public static void main(String[] args) {
        // open chrome
        WebDriver driver = WebDriverFactor.getDriver("chrome");
        driver.get("https://practice.cybertekschool.com/forgot_password");


        //  save url to string variable
        String expectedUrl = driver.getCurrentUrl();


        // click on Retrieve password
       WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
       retrievePasswordButton.click();


       //save url after clicking button
        String  actualUrl = driver.getCurrentUrl();


        //compare two url
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Pass");

       }else {
            System.out.println("Fail");

        }

        // close the browser
        driver.quit();












    }

}
