package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

@Test
    public void test1() {

    WebDriver driver = WebDriverFactor.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");

   //1. locate the dropdown element with unique locator
    WebElement dropdownElement = driver.findElement(By.id("state"));

    // create select object by passing the element as a constructor
    Select stateList = new Select(dropdownElement);

//getOptions->retuns all the available options from the dropdown list
    List<WebElement> options = stateList.getOptions();

    System.out.println(options.size());

    for (WebElement option : options) {
          System.out.println(option.getText());

    }
}
@Test
        public void test2() throws InterruptedException {


    WebDriver driver = WebDriverFactor.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement dropdownElement = driver.findElement(By.id("state"));

    Select  stateList = new Select(dropdownElement);

    String actualOption= stateList.getFirstSelectedOption().getText();
    String expectedOption ="Select a State";
    Assert.assertEquals(expectedOption, actualOption,"Verify first selection is select a state");


    //HOW TO SELECT OPTIONS FROM THE DROPDOWN?
    // 1. USING VISIBLE TEXT
    // selectByVisibleText("text")--> selecting based on the visible text
     Thread.sleep(3000);
     // select the texas from the dropdown
    stateList.selectByVisibleText("Texas");

    actualOption=stateList.getFirstSelectedOption().getText();
    Assert.assertEquals(actualOption, "Texas");


    //2.using index number
    //total option --> 52

    stateList.selectByIndex(51);
    //  or   stateList.selectByIndex(stateList.getOptions().size()-1);

    System.out.println("stateList.getFirstSelectedOption().getText() = " + stateList.getFirstSelectedOption().getText());
Assert.assertEquals(stateList.getFirstSelectedOption().getText(), "Wyoming");

  //  3. Using Value
    Thread.sleep(2000);
stateList.selectByValue("VA");
    System.out.println(stateList.getFirstSelectedOption().getText());


    Thread.sleep(3000);
    // stateList.deselectByVisibleText("Texas");


    // 4. stateList.deselectAll();--> is for multiple selection
    //              ^^
    //              ||


    driver.quit();





} 
        
        
        
        
        
        
        
        
  








}

