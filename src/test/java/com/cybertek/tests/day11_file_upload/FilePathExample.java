package com.cybertek.tests.day11_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){

        System.out.println(System.getProperty("user.dir"));

        String projectPath = System.getProperty("user.dir");

        String relativePath= "src/test/resources/testfile.txt";

        String filePath= projectPath+"/"+relativePath;
        System.out.println(filePath);

        // why we don't use full path?
        // when we use full path , it will only run on
        // my current computer but not on your computer!
    }

}
