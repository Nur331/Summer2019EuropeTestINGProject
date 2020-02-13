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

public class ActionsTest {

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


    @Test
    public void hoverTest(){
      driver.get("http://practice.cybertekschool.com/hovers");

       //Actions --> is classes that contains all the user interaction
        // how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);

        WebElement img= driver.findElement(By.tagName("img"));
       actions.moveToElement(img).perform();

       Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(), "Verify view profile display");




    }

    @Test
    public void DragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index" );


        Actions actions= new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver. findElement(By.id("droptarget"));

        //Thread.sleep(2000);
        //pause()--> just like thread.sleep; accepts milliseconds
        actions.pause(2000);
        // clicking the accepting cookies button
        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();

        actions.dragAndDrop(source, target).perform();

    }



    @Test
    public void DragAndDropChaining() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index" );


        Actions actions= new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver. findElement(By.id("droptarget"));

        //Thread.sleep(2000);
        //pause()--> just like thread.sleep; accepts milliseconds
        actions.pause(2000);
        // clicking the accepting cookies button
        driver.findElement(By.xpath("//button[.='Accept Cookies']")).click();

        // if you are chaining actions we add build() method before perform().
        actions.moveToElement(source).clickAndHold().pause(2000).moveToElement(target).release().build().perform();

    }














}
