package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElement {

    @Test
    public void test1() throws InterruptedException {


        WebDriver driver = WebDriverFactor.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(), 6, " verify we got 6 buttons.");

        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }}

        @Test
        public void test2 () {

            WebDriver driver = WebDriverFactor.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/multiple_buttons");


            //if wrong locator but we are not getting ay error, we are getting empty list.
            List<WebElement> buttons = driver.findElements(By.tagName("buttonjhhgyf"));
            System.out.println("buttons.size()= "+ buttons.size());



            // Thread.sleep(8000);
            //  driver.quit();

        }}










