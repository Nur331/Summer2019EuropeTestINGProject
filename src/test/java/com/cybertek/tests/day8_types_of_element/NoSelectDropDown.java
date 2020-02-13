package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {


    @Test
    public void test1(){
        WebDriver driver= WebDriverFactor.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        // open the dropdown;
        dropdownElement.click();

        List<WebElement> listOfLinks = driver.findElements(By.className("dropdown-item"));

        // size of the element
        System.out.println("Number of links =" +listOfLinks.size());

        // text of the first element in the list, using index number
        System.out.println("text of the first element = " + listOfLinks.get(0).getText());


        // print text of each link
        for (WebElement Link : listOfLinks) {
            System.out.println(Link.getText());
        }

        // locate the element  and clicking it
       // driver.findElement(By.linkText("Yahoo")).click();

        // index of the list  and click
        listOfLinks.get(2).click();


        driver.quit();

    }
}
