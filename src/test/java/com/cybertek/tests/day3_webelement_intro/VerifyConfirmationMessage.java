package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.namespace.QName;

public class VerifyConfirmationMessage {

    /**
     * verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * links to an external site
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) {
        // open browser
        WebDriver driver = WebDriverFactor.getDriver("chrome");

        // navigate to website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // enter any email
        WebElement emailInputbox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";
        //send expectedEmail
        emailInputbox.sendKeys(expectedEmail);



        System.out.println(emailInputbox);
        // get Attribute() --> get value of attributes

       String actualEmail = emailInputbox.getAttribute("value");

        if (expectedEmail.equals(actualEmail)){
             System.out.println("PASS");

        }else {
             System.out.println("FAIL");
             System.out.println("expectedEmail =" + expectedEmail);
             System.out.println("actualEmail =" + actualEmail);

}

WebElement retrieevPasswordButton = driver.findElement(By.id("form_submit"));

retrieevPasswordButton.click();

String expectedMessage ="Your e-mail's been sent!";

   WebElement messageElement = driver.findElement(By.name("confirmation_message"));

System.out.println(messageElement);

String actualMessage = messageElement.getText();

        System.out.println(actualMessage);

if (expectedMessage.equals(actualMessage)){
    System.out.println("PASS");

}else {
    System.out.println("FAIL");
    System.out.println("expectedMessage = "+expectedMessage);
    System.out.println("actualMessage = "+actualMessage);

}
driver.quit();








    }




}
