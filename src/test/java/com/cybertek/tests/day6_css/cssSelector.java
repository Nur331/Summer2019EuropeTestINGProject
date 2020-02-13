package com.cybertek.tests.day6_css;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssSelector {


    private static WebDriverFactor WebDriverFactory;

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement Button1Button = driver.findElement(By.cssSelector("[onclick='button1()']"));

        String message = Button1Button.getText();

        System.out.println("message = " + message);

        driver.quit();


    }





}
