package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ContactInfoPage extends BasePage {

    @FindBy(xpath="//h1[@class='user-name']")
    public WebElement fullname;

    @FindBy(xpath = "//a[@class='email']")
    public WebElement email;

    @FindBy(xpath = "//a[@class='phone']")
    public WebElement phone;







}
