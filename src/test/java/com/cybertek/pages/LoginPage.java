package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(){

    PageFactory.initElements(Driver.get(), this);}

    // there are three types of method to finding element
    //1. @FindBy
    //2.@FindAll--> giving a change to multiple locator by different locators
    //it needs only one locator is matching
    //3.@FindBys-->if element is dynamic and need multiple locators,
    // between multiple locators having "and" relationship, must
    // both locators are matching.


   // @FindAll({

    //        @FindBy(id = "prependedInput")
   //         @FindBy(name = "_username")
//    })


// same with driver.finelement(By.id("prependedInput"));
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;



    public void login(String usernameStr, String passwordStr){

usernameInput.sendKeys(usernameStr);
passwordInput.sendKeys(passwordStr);
loginBtn.click();
    }









}
