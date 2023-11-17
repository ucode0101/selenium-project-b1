package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExceptionsInSelenium {

    @Test
    public void testExceptions(){

        Driver.getDriver().get(ConfigReader.getProperty("testUrl"));

        // NoSuchElementException: no such element: Unable to locate element
        // WebElement element = Driver.getDriver().findElement(By.id("someID"));

        //String someWindow = "234Tes4757hdlskjf"; // invalid window handle

        // org.openqa.selenium.NoSuchWindowException: no such window
       // Driver.getDriver().switchTo().window(someWindow);


        // org.openqa.selenium.NoSuchFrameException: No frame element found by name or id someInvalidFrame
       // Driver.getDriver().switchTo().frame("someInvalidFrame");

        // org.openqa.selenium.NoAlertPresentException: no such alert
       // Driver.getDriver().switchTo().alert().accept();

        WebElement elm = Driver.getDriver().findElement(By.xpath("//a[text()='A/B Testing']"));
        elm.click();

        Waits.wait(2);
        Driver.getDriver().navigate().back();

        // after the refresh the DOM gets updated
        // but the web element (elm) will be outdated
        Driver.getDriver().navigate().refresh();
        Waits.wait(2);

        elm.click(); // StaleElementReferenceException


    }
}
