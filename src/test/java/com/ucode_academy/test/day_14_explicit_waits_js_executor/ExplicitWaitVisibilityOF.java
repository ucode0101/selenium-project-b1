package com.ucode_academy.test.day_14_explicit_waits_js_executor;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitVisibilityOF extends TestBase {

    @Test
    public void visibilityOf(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // this will throw NoSuchElementException because the element is not available yet
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='finish']/h4"))));

        // it will wait until web element is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));

        // it will throw NoSuchElementException, because the element is not available
        String  text = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();

        System.out.println(text);
    }
}
