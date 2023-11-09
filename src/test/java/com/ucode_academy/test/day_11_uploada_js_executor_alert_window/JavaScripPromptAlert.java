package com.ucode_academy.test.day_11_uploada_js_executor_alert_window;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScripPromptAlert extends TestBase {

    @Test
    public void jsPromptAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // find web element and click on it
       driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
       Thread.sleep(2000);

       // Create alert and switch driver to alert
        Alert alert = driver.switchTo().alert();

        // switch driver to alert and handle the alert directly
        //driver.switchTo().alert().accept();

        alert.sendKeys("Hello Alert");

        Thread.sleep(2000);
        alert.accept();

        // to locate web element and get text directly without storing in Web Element
        String text = driver.findElement(By.id("result")).getText();

        System.out.println(text);


    }

}
