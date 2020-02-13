package com.cybertek.tests.day5_xpath;

import com.cybertek.Utilities.WebDriverFactor;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.ls.LSOutput;

public class XpathTest {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactor.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homelink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

homelink.click();








    }
}
