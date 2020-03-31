package com.cybertek.tests.day18_DDF;

import com.cybertek.Utilities.ExcelUtil;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object[][] userData() {

        ExcelUtil data = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        String[][] dataArray = data.getDataArrayWithoutFirstRow();

        return dataArray;

    }

    @Test(dataProvider = "userData")
    public void loginTestDDF(String username, String password, String first_name, String last_name ) {

        extentLogger = report.createTest("Test" + username + " " + password);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        String actualFirstname = dashboardPage.getUserName();
        String expectedFullname = first_name + " " + last_name;

        Assert.assertEquals(actualFirstname, expectedFullname, "Compare Full names");


    }








































}
