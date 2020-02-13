package com.cybertek.tests.day_9_Popups_tabs_frames;

import com.cybertek.Utilities.WebDriverFactor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver  driver;

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
   public void htmlPopUp() {
       driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

       // locating and clicking on it
       driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
       // locatin no button and clicking it
       driver.findElement(By.xpath("//*[text()='No']")).click();

   }

    @Test
    public void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click for js Alert
        driver.findElement(By.xpath("//button[1]")).click();

        // controlling alert using with Alert class
        Alert  alert= driver.switchTo().alert();
        Thread.sleep(2000);
        //accept alert   --> clicking ok in the alerts
        alert.accept();

// alert method has 4 different methods:
        //  accept
        // dismiss
        //sendkeys
        //getText


        // clicking JS Confirm button
        driver.findElement(By.xpath("//button[2]")).click();
       // clicking x to close , selecting no / cancel
        alert.dismiss();


        // clicking JS prompt
        driver.findElement(By.xpath("//button[3]")).click();
        // sendkey()--> send some keys
        Thread.sleep(2000);
         alert.sendKeys("Mike Smith");
        Thread.sleep(1000);
        // after sending keys you have to clicking ok button then you might see result on scream
         alert.accept();
    }
















}
