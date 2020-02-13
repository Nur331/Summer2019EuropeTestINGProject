package com.cybertek.tests.day12_actions_jsExecutor;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hovertest {

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

//  (how can we hover over multiple web element)test case for multiple image we need to hover over and
//  get text or clicking on it
   @Test
   public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 1; i < 4; i++) {

            Thread.sleep(1000);

            // creating  dynamic xpath using i
            String imageXpath = "(//img)[" + i + "]";
            System.out.println("after combining string"+imageXpath);


            // passing xpath to web element
            WebElement img = driver.findElement(By.xpath(imageXpath));

           // creating action object
            Actions action = new Actions(driver);
            Thread.sleep(2000);

           // hovering over on the image
            action.moveToElement(img).perform();


            // creating dynamic xpath for the text
            String textXpath="//h5[.='name: user"+i+"']";
            System.out.println("textXpath = "+textXpath);


            // passing xpath to web element
            WebElement text = driver.findElement(By.xpath(textXpath));

            // verifying text is displayed
            Assert.assertTrue(text.isDisplayed());


       }


   }

















}
