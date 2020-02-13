package com.cybertek.tests.day10_sync;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactor.getDriver("chrome");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
     //   Thread.sleep(2000);
        driver.quit();

    }


    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        //clicking the start button
        driver.findElement(By.tagName("button")).click();

        //find the username inputbox
        WebElement username = driver.findElement(By.id("username"));

        // How to wait Explicitly?
        WebDriverWait wait = new WebDriverWait(driver, 50);


        //call until method from wait object
        //waiting for the specific element to be visible (up to 10 sec)
        wait.until(ExpectedConditions.visibilityOf(username));


        //sending some username
        username.sendKeys("MikeSmith");

    }

    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        // clicking Enable button
        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();

       // finding input box
        WebElement inputBox= driver.findElement(By.cssSelector("input[type='text']"));

        // wait until inputbox is enable or clickable
        // create to object to wait
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(inputBox));

       //typing sth in the inputBox
       inputBox.sendKeys("Something  Something");

    }


















}
