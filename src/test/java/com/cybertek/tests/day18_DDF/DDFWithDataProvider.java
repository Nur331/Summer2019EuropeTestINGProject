package com.cybertek.tests.day18_DDF;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData() {

        String[][] data = {
                {"Got", "9"},
                {"HIMYM", "9"},
                {"friends", "10"},
                {"person of Interest", "10"},
                {"Breaking Bad", "9"},
                {"Big Bang Theory", "9"},
        };
        return data;
    }

    // get data from data provider and pass as and argument
    @Test(dataProvider = "testData")

    public void test1(String tvshow, String rating) {
        System.out.println("Tv show :" + tvshow + " has rating " + rating);

    }
}









