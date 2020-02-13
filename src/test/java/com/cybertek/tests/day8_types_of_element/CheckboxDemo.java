package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactor.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));


        // verify that checkbox1 is unselected and 2 is selected default
        //isSelected()-->  returns true if the element is selected
        // checkbox1.isSelected();


        Assert.assertFalse(checkbox1.isSelected(), "verify checkbox1 is not selected.");
        Assert.assertTrue(checkbox2.isSelected(), "verify checkbox 2 is selected.");


        System.out.println("checkbox1.isSelected() =  "+ checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        checkbox1.click();

        // verify that both of the checkbox are selected
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox1.isSelected(), "1 is selected");
        Assert.assertTrue(checkbox2.isSelected(), "2 is selected");


        driver.quit();
    }






}
