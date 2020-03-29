package com.cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;
    protected String url;

    @BeforeTest
    public void setUpTest(){

        // initialize the class
        report = new ExtentReports();

        //create report path
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";

        // initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        // attach the html report to the report object
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke test");

        // set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser",ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

    }
    @AfterTest
    public void tearDownTest(){
        // this is how the report is actually created
        report.flush();


    }


    @BeforeMethod
    @Parameters("env")
    //@Optional mark the parameter optional so that we do not always have to provide it
    public void setUpMethod( @Optional String env){
        System.out.println("env = "+ env);

        // if env variable is null use default  url
        //if it is not null, get url based on env
        if(env==null){
            url=ConfigurationReader.get("url");

        } else{
            // env = qa1   / qa1_url
            // env = qa2
            url=ConfigurationReader.get(env+"_url");
        }


        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver,10);

        driver.get(url);
        driver.manage().window().maximize();
    }

    //ITestResult class describes the result of a test in TestNG
    @AfterMethod
    public void tearDownMethod(ITestResult result) throws InterruptedException, IOException {
       //If test failed
        if (result.getStatus() == ITestResult.FAILURE) {

            //record the name of the failed test case
          //  extentLogger.fail(result.getName());


            // take the screenshot and return location of screenshot

            String screenshotPath = BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotPath);

            // capture the exception
            extentLogger.fail(result.getThrowable());
        }else if (result.getStatus()==ITestResult.SKIP){
            extentLogger.skip("Test skipped: "+result.getName());
        }

            //Close the driver
            Thread.sleep(2000);
            Driver.closeDriver();


    }

}
