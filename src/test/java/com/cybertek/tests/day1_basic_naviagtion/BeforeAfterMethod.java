package com.cybertek.tests.day1_basic_naviagtion;

import com.cybertek.Utilities.WebDriverFactor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethod {



    // setup webDriver  3 ways

   // 1.  System.setProperty("webdriver.chrome.driver","chromedriver");
   // 2.
           WebDriver driver;
   // 3.  WebDriverManager.chromedriver().setup();



    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactor.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }


    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void test1(){

    }



//====================================


// OR  after 29-jan-2020
/*
    WebDriver  driver;

    @BeforeMethod
    public void setUpMethod(){
       driver = WebDriverFactor.getDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();

    }


   @Test
   public void test1(){
       driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");



   }
*/
}
