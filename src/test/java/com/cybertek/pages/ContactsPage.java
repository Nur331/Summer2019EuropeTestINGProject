package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{
    // we don't need to create constructor and use pageFactory class here,
    // since we are extending from BasePage


    //*Test case
    // open the chrome
    // go to qa3.Vytrack
    // login in as a sales manager
    // navigate to customers -> contacts
    // click on email mbrackstone9@example.com
    // verify that full name is Ms Mariam Brackstone
    // verify that email is mbrackstone9@example.com
    // verify that phone number is +18982323434*//


    // if you are trying to come up dynamic xpath you cannot use @FindBy
    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email;

//somehow we will have dynamic xpath which accepts email and return us dynamically
// create a method that accepts email as a string, and returns WebElement based on that email

public WebElement getContentEmail(String email){

 String emailXpath="//td[contains(text(),'"+email+"')][@data-column-label='Email']";
     return Driver.get().findElement(By.xpath(emailXpath));



}







}
