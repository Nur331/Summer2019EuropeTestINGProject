package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        // open the webbrowser
        WebDriver  driver = WebDriverFactor.getDriver("chrome");

        driver.manage().window().maximize();
// navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput = driver.findElement(By.name("full_name"));


        fullnameInput.sendKeys("Mike Smith");

WebElement  secondInput = driver.findElement(By.name("email"));

secondInput.sendKeys("Mikesmith@gmail.com");

WebElement  signupButton = driver.findElement(By.name("wooden_spoon"));
signupButton.click();

// verify that you got right massage

WebElement messageElement = driver.findElement(By.name("signup_message"));

String actualMessage = messageElement.getText();

 String   expectedMessage="Thank you for signing up. Click the button below to return to the home page.";


if (expectedMessage.equals(actualMessage)){
    System.out.println("PASS");

}else {
    System.out.println("FAIL");

    System.out.println("expectedMessage = " + expectedMessage);
    System.out.println("actualMessage = " + actualMessage);
}

 driver.quit();









    }
}
