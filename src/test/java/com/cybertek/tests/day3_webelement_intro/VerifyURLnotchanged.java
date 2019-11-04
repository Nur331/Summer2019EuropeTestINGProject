package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.Utilities.WebDriverFactor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class VerifyURLnotchanged {

    private static  WebDriverFactory;

    /**
     * Verify URL not changed
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     *
     */

    public static void main(String[] args) {

        WebDriver driver =WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");






    }
}
