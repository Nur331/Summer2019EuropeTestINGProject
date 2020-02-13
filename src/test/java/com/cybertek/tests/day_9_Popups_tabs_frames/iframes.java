package com.cybertek.tests.day_9_Popups_tabs_frames;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactor.getDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        // how to switch frames
        driver.switchTo().frame("mce_0_ifr");
        // clear the text inside the box
        driver.findElement(By.id("tinymce")).clear();
        // locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("we use here name or id");

        // after action on baby html, compiler goes back t first frame,
        //useful  when we have switched multiple frames
        driver.switchTo().defaultContent();


        Thread.sleep(3000);
        // 2. using index
        driver.switchTo().frame(0);
        // clear the text inside the box
        driver.findElement(By.id("tinymce")).clear();
        // locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("we use here index");

        // go back to first frame, only one parent
        driver.switchTo().parentFrame();
        Thread.sleep(3000);


        // 3. using webElement
        WebElement frameElement = driver.findElement(By.tagName("iframe"));

        // passing frame as a webElement
        driver.switchTo().frame(frameElement);

        // clear the text inside the box
        driver.findElement(By.id("tinymce")).clear();
        // locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("we locate with WebElement.");

    }




    @Test
    public void multipleFrames(){

        driver.get("http://practice.cybertekschool.com/nested_frames");


        // switching to frame top
        driver.switchTo().frame("frame-top");
        // frame top has 3 childen frame, left middle and right
        // switching to middle frame
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

     // go back to parent (top frame)to switch right
     driver.switchTo().parentFrame();

     //switching right using index
        driver.switchTo().frame(2);

     // print right from right frame
        System.out.println( driver.findElement(By.tagName("body")).getText());

        //  go up to top level html directly
        driver.switchTo().defaultContent();

        // switch to frame bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }













    }
