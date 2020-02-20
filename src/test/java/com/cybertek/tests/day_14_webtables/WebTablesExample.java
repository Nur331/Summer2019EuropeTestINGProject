package com.cybertek.tests.day_14_webtables;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesExample {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactor.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();

    }

@Test
    public void  printTable() {

    WebElement table = driver.findElement(By.id("table1"));

    String wholeTable = table.getText();
    System.out.println(table.getText());

    // verify that "jsmith@gmail.com" is in the table
    Assert.assertTrue(wholeTable.contains("jsmith@gmail.com"), "verify jsmith@gmail.com is in the table");

}



@Test
    public void GetAllHeaders() {

    // how many columns we have ?
    List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
    System.out.println("Numbers of columns is " + headers.size());


// print each column name one by one
    for (WebElement header : headers) {
        System.out.println(header.getText());
    }
}


@Test
    public void PrintTableSize(){

        //  number of columns
    List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
    System.out.println("Numbers of columns = " + headers.size());


        // number of rows with header
  List<WebElement>  allRowsWithHeader=driver.findElements(By.xpath("//table[@id='table1']//tr"));
    System.out.println("allRowsWithHeader = " + allRowsWithHeader.size());


    // number of rows without  header(we prefer  this)
List<WebElement>  allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
    System.out.println("allRowsWithoutHeader = " + allRowsWithoutHeader.size());


    }


    @Test
    public void GetRow(){

        WebElement SecondRow= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
        System.out.println(SecondRow.getText());

   // get all the rows dynamically, we  can do in 2 steps
        // 1. get the number of the rows
        // 2.based on the number of the rows, iterate each row

        List<WebElement>  allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for (int i = 1; i <=allRows.size() ; i++) {
            String  rowxpath= "//table[@id='table1']/tbody/tr["+i+"]";
            System.out.println("rowxpath = " + rowxpath);
           WebElement singleRow=  driver.findElement(By.xpath(rowxpath));
            System.out.println(singleRow.getText());
        }



}

     @Test
    public void getAllCellsInOneRow(){
        List<WebElement> allCellsInoneRow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));

         for (WebElement cell : allCellsInoneRow) {
             System.out.println(cell.getText());
         }
     }


    @Test
    public void getSingleCellByIndex(){
        WebElement singleCell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[3]"));
        System.out.println(singleCell.getText());
    }

    @Test
    public void printAllCellsByIndex(){

        // number of rows
    int rowNumber=getNumberOfrows();
        System.out.println(rowNumber);

    // number of columns
        int colNumber=getNumberOfcolumns();
        System.out.println(colNumber);

        //iterate through each row in the table
        for (int i = 1; i <=rowNumber; i++) {
        // iterate through each cell in the table
            for (int j = 1; j <=colNumber; j++) {

                // creating dynamic xpath
                String xpath="//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
                System.out.println(xpath);

                //passing each cell xpath and print it
                WebElement SingleCell=driver.findElement(By.xpath(xpath));
                System.out.println(SingleCell.getText());




            }
        }}

       @Test
        public void getSpecificCellByIndex() {

           int r = 2;
           int c = 3;

           String xpath = "//table[@id='table1']/tbody/tr[" + r + "]/td[" + c + "]";
           WebElement SingleCell = driver.findElement(By.xpath(xpath));
           System.out.println(SingleCell.getText());

       }

       // HOMEWORK
    //create a method that accepts ro and column numbers,
    //and return the cell as a webElement.

@Test
public void getCellInRelationToAnotherCellInSameRow(){

String firstName="Tim";
String xpath="//table[@id='table1']//td[.='"+firstName+"']/../td[3]";
WebElement email=driver.findElement(By.xpath(xpath));
    System.out.println(email.getText());


}









    private int getNumberOfcolumns() {
        List<WebElement> allColumns=driver.findElements(By.xpath("//table[@id='table1']//th"));
         return  allColumns.size();
    }

    private int getNumberOfrows() {
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();


    }


}
