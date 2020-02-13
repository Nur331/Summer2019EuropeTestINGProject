package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){

        System.out.println("this is test1");
    }


    //  @Ignore
    @Test
    public void test2(){
        System.out.println("this is test2");

    }

@BeforeMethod
    public void setUpMethod(){

    System.out.println("BEFORE METHOD");
    System.out.println("opening the browser");
}


@AfterMethod
    public void tearDown(){
    System.out.println("after method");
    System.out.println("close browser");
}


@BeforeClass
    public void beforeclass(){

    System.out.println("before class code");
}

@AfterClass
    public void afterclass(){
    System.out.println("after class code");
    System.out.println("reporting");
}












}
