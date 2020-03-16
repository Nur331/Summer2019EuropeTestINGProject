package com.cybertek.tests.day16_Pom_Tests_Final;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   VERIFY  Radio Buttons
    open browser
    Login as driver
    Go to Activities--> Calender Events
    Click on create calendar events
    Click on repeat
    Verify that repeat every day is checked
    Verify that repeat weekday is not checked
*/
public class RepeatOptionsTests extends TestBase {


    @Test
    public void RepeatRadioButtonTest() throws InterruptedException {
//  Login as driver and login
        LoginPage loginPage=new LoginPage();

        String username= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        loginPage.login(username, password);
        BrowserUtils.waitFor(3);

// Go to Activities--> Calender Events
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

//    Click on create calendar events

   CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
   calendarEventsPage.waitUntilLoaderScreenDisappear();
        Thread.sleep(3000);
   calendarEventsPage.createCalendarEvent.click();


   // click on repeat
        Thread.sleep(3000);
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
         createCalendarEventsPage.repeat.click();

//    Verify that repeat every day is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),
                "verify days radioBTN is selected");

        //    Verify that repeat weekday is not checked
Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),
        "verify that weekday is not selected");

    }

 /*
    VERIFY REPEAT OPTIONS
    open browser
    Login as driver
    Go to Activities-->Calender
   Click on create calendar events
   Click on repeat
   verify that repeat options are Daily, Weekly, Monthly, Yearly(in this order).

*/

 @Test
    public void verifyRepeatOptions() throws InterruptedException {

     //  Login as driver and login
     LoginPage loginPage=new LoginPage();

     String username= ConfigurationReader.get("driver_username");
     String password=ConfigurationReader.get("driver_password");

     loginPage.login(username, password);
     BrowserUtils.waitFor(5);

// Go to Activities--> Calender Events
    // DashboardPage dashboardPage=new DashboardPage();
     new DashboardPage().navigateToModule("Activities", "Calendar Events");

//    Click on create calendar events

     CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
     calendarEventsPage.waitUntilLoaderScreenDisappear();
     Thread.sleep(5000);
     calendarEventsPage.createCalendarEvent.click();


     // click on repeat
     Thread.sleep(5000);
     CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
     calendarEventsPage.waitUntilLoaderScreenDisappear();
     createCalendarEventsPage.repeat.click();

//   verify that repeat options are Daily, Weekly, Monthly, Yearly(in this order).
     // there we have three  ways to verify it, here is first one(this way is not usable):
     // by this way we need to verify one by one

    //1.
     //String expectedResult="Daily";
     //String actualResult=createCalendarEventsPage.myUser.getText();
     //Assert.assertEquals(actualResult, expectedResult);


     // here is second and more usable way to verify them
     //2.

     List<String> expectedList= Arrays.asList("Daily","Weekly","Monthly","Yearly");
     List<WebElement>  actualOptions=createCalendarEventsPage.repeatOptionsList().getOptions();

     List<String>  actualList=new ArrayList<>();

     for (WebElement option : actualOptions) {
         // get each webElement text inside the dropdown and add to actual list
         actualList.add(option.getText());
     }
     // compare actual and expected list value
     Assert.assertEquals(actualList,expectedList,"Compare dropdown values");


     //3.
  //    List<String> expectedList= Arrays.asList("Daily","Weekly","Monthly","Yearly");
  //   List<WebElement>  actualOptions=createCalendarEventsPage.repeatOptionsList().getOptions();

  // get text of each webElement and return as a list of String
     // we are suggested to use this 3. way
  //List<String>  actualList= BrowserUtils.getElementsText(actualOptions);









 }






}
