package com.cybertek.tests.day15_Pom_Tests;

import com.cybertek.Utilities.ConfigurationReader;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /*
    Test Case
    open browser
    login as a driver
    verify that page subtitle is quick launchpad
    go to activities --> Calender Events
    verify that page subtitle is Calendar Events
    */


    @Test
    public <CalendarEventsPage> void verifySubtitleTest(){


        LoginPage loginPage= new LoginPage();

        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();

        String expectedSubtitle= "Quick Launchpad";
        String actualSubtitle=dashboardPage.getPageSubTitle();

        Assert.assertEquals(expectedSubtitle, actualSubtitle,"Verify subtitle");


        dashboardPage.navigateToModule("Activities", "Calendar Events");
       // dashboardPage.navigateToModule("Customers", "Accounts");
        //dashboardPage.navigateToModule("System", "Jobs");



  Assert.assertEquals(dashboardPage.getPageSubTitle(), "Calendar Events","verify subtitle");


    }

}
