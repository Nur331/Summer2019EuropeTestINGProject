package com.cybertek.tests.day17_review_screenshot;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTests extends TestBase {


    //*Test case
    // open the chrome
    // go to qa3.Vytrack
    // login in as a sales manager
    // navigate to customers -> contacts
    // click on email mbrackstone9@example.com
    // verify that full name is Ms Mariam Brackstone
    // verify that email is mbrackstone9@example.com
    // verify that phone number is +18982323434*//

    @Test
    public void contactDetailsTest(){
   extentLogger=report.createTest("contactDetailsTest");

        // login as a salesmanager
        LoginPage loginPage= new LoginPage();
        String username = ConfigurationReader.get("salesManager_username");
        String password= ConfigurationReader.get("salesManager_password");
      extentLogger.info("username: "+username);
      extentLogger.info("password: "+password);
      extentLogger.info("Login as a sales maanger");
      loginPage.login(username,password);


        ContactsPage contactsPage=new ContactsPage();
        extentLogger.info("navigate to customers -> Contacts");
        contactsPage.navigateToModule("Customers","Contacts");


        contactsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        extentLogger.info("clicking on email: mbrackstone9@example.com");
        contactsPage.getContentEmail("mbrackstone9@example.com").click();


        ContactInfoPage contactInfoPage = new ContactInfoPage();

        String actualFullname= contactInfoPage.fullname.getText();
        String expectedFullname="Ms Mariam Brackstone";


        extentLogger.info("Verify fullname is "+expectedFullname);
        Assert.assertEquals(actualFullname, expectedFullname,"Verify Fullname");

        extentLogger.info("Verify email is mbrackstone9@example.com");
Assert.assertEquals(contactInfoPage.email.getText(), "mbrackstone9@example.com","Verify email is mbrackstone9@example.com");

extentLogger.info("Verify phone number is +18982323434");
Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434","Verify phone number is +18982323434");








    }









}
