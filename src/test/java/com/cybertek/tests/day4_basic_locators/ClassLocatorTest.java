package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactor.getDriver("chrome");
driver.manage().window().maximize();

  driver.get("http://practice.cybertekschool.com/sign_up");


WebElement  homelink=driver.findElement(By.className("nav-link"));
homelink.click();

driver.get("http://practice.cybertekschool.com/multiple_buttons");

//proper way
        WebElement messageElement = driver.findElement(By.className("h3"));
        String message = messageElement.getText();
        System.out.println(message);


// same as boven three lines  (lazy way)
System.out.println(driver.findElement(By.className("h3")).getText());

//  ***  important!!!
        // if there are space in the class name , we should CANNOT use class name!


    }

}
