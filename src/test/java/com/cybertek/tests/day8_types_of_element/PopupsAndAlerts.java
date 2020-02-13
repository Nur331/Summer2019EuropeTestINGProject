package com.cybertek.tests.day8_types_of_element;

import com.cybertek.Utilities.WebDriverFactor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactor.getDriver("chrome");
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");






    driver.quit();

    }



}
