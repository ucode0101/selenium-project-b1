package com.ucode_academy.test.day_14_waits_testng_reports_parallel;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitInvisibilityOf extends TestBase {

    @Test
    public void invisibilityOf(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // to locate and click on start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loading = driver.findElement(By.cssSelector("div#loading"));

        wait.until(ExpectedConditions.invisibilityOf(loading));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated())

        String text = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
        System.out.println(text);


    }
}
