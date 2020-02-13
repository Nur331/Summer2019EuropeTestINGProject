package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

  @Test
    public void test1(){

      WebDriver driver= WebDriverFactor.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/radio_buttons");

      WebElement radiobutton=driver.findElement(By.id("blue"));
      System.out.println(radiobutton.getAttribute("name"));
      System.out.println(radiobutton.getAttribute("id"));
      System.out.println(radiobutton.getAttribute("type"));
      System.out.println(radiobutton.getAttribute("href"));
      // checked attribute value is boolean
      System.out.println(radiobutton.getAttribute("checked"));
      // outerHTML returns full html of the element
      System.out.println(radiobutton.getAttribute("outerHTML"));

      System.out.println(radiobutton.getAttribute("innerHTML"));


      driver.quit();

    // when we need text of the element we have 3 ways to find it
    //1. getText();
    //2. getAttribute("value");
    //3. innerHTML--> System.out.println(radioButton.getAttribute("innerHTML"));
















  }



















}
