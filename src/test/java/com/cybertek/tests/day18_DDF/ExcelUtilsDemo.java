package com.cybertek.tests.day18_DDF;

import com.cybertek.Utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {


    @Test
    public void readExcelFile() {

        // create an object from excelUtil
        // it accepts two argument
        //Argument 1: location of the file(path)
        //Argument 2: sheet that we want to open (sheetName)


        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        // how many rows in the sheet
        System.out.println("Row count: " + qa3short.rowCount());

// How many columns in the  sheet
        System.out.println("Column count:" + qa3short.columnCount());

// get all column names
        System.out.println("Column names:" + qa3short.getColumnsNames());

        List<Map<String, String>> dataList = (List<Map<String, String>>) qa3short.getDataList();

        //  System.out.println(dataList.get(0).get("firstname"));
        for (Map<String, String> onerow : dataList) {
            System.out.println(onerow);
        }
        // get all data in 2d array
        String[][] dataArray = qa3short.getDataArray();

        // print the array
        System.out.println(Arrays.deepToString(dataArray));

    }

}


















