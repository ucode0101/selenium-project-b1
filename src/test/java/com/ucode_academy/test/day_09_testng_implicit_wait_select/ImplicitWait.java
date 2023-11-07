package com.ucode_academy.test.day_09_testng_implicit_wait_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    @Test
    public void implicitWait(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // This is how we set it (once per driver session) in Selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // for Selenium 3
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://demoqa.com/dynamic-properties");

       WebElement element2 = driver.findElement(By.id("visibleAfter"));
        element2.click();
    }
}
