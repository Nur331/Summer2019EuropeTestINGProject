package com.cybertek.tests.day11_file_upload;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class fileUploadTest {

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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.name("file")).sendKeys("/Users/yasenalinur/Desktop/file.txt");

        driver.findElement(By.id("file-submit")).click();

        String actualFilename=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFilename, "file.txt","Verify the file name");

// as a tester, try to make test case fail and make sure the test is going fine
// for example make "file.txt" to "files.txt"




    }



    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/upload");
         // getting dynamic file path
        String projectPath = System.getProperty("user.dir");

        String relativePath= "src/test/resources/testfile.txt";

        String filePath= projectPath+"/"+relativePath;
        System.out.println(filePath);
         // sending file to the input
        driver.findElement(By.name("file")).sendKeys(filePath);
        // clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        // getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        // verify file name is dislayed in the next page
        Assert.assertEquals(actualFilename, "testfile.txt", "Verify the file name");


    }



    }
