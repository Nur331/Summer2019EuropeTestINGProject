package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
    public void test1() {

        System.out.println("First Assertion");
        Assert.assertEquals("one", "one");

        System.out.println("second Assertion");
        Assert.assertEquals("title", "title");

        //if second assertion is fail, then compiler wil not came to line 18
        System.out.println("after second assertion");

    }


       @Test
       public void test2() {

        // verify that title starts with "c"

        String actualTitle = "Cybertek";
        String expectTitleBeginning = "C";

        // System.out.println("second test second assertion");
        Assert.assertTrue(actualTitle.startsWith(expectTitleBeginning), "verify title stars with c");


     // Assert.assertEquals("jm@gmail.com", "hs@gmail.com", "fail");
        Assert.assertTrue("jm@gmail.com".contains("@"), "verify Email has @");

    }

    @Test
    public void test3(){

        Assert.assertNotEquals("one", "two","one shouldnt equal to two");
   }



    @Test
    public void test4(){

         Assert.assertFalse(1<0);

      }















}
