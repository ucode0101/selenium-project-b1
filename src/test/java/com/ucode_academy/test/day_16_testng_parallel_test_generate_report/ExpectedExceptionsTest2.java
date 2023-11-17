package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExpectedExceptionsTest2 {

    @Test (expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptions(){

        Driver.getDriver().get(ConfigReader.getProperty("smartBearUrl"));

        WebElement usernameInput = Driver.getDriver().findElement(By.id("1233MainContent_username"));

        Waits.wait(3);

        Driver.quitDriver();


    }
}
