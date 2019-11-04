package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {

        WebDriver  driver = WebDriverFactor.getDriver("chrome");

        driver.get("https://www.google.com");

    }
}
