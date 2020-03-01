package com.cybertek.tests.day15_Pom_Tests;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

@Test
    public  void loginAsDriver(){

    LoginPage loginPage=new LoginPage();

    String username= ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    loginPage.login(username, password);

    Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");
}


@Test
    public void loginAsStoreManager(){
  LoginPage  loginPage=new LoginPage();

  String username=ConfigurationReader.get("storemanager_username");
  String password= ConfigurationReader.get("storemanager_password");

loginPage.login(username, password);

    Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");





}


}
