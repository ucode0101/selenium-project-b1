package com.ucode_academy.test.day_14_waits_testng_reports_parallel;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitToBeClickable extends TestBase {


    @Test
    public void waitToBeClickable(){
        driver.get("https://only-testing-blog.blogspot.com/2013/11/new-test.html?");

        WebElement submitBtn = driver.findElement(By.cssSelector("input#submitButton"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        // wait until element/btn is clickable
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)); // you can either click here


        submitBtn.click(); // you can click on a new line

       // submitBtn.click(); // Even though it didn't throw any exception, but it didn't work

        Waits.wait(3);
    }

}
