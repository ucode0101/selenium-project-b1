package com.ucode_academy.test.day_11_js_alerts_iframes;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptConfirmationAlert extends TestBase {

    @Test
    public void jsConfirmationAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsAlert.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        // to click on Cancel button
        //alert.dismiss(); one way

        //driver.switchTo().alert().dismiss(); another way

        // to click on Ok button
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println(result.getText());

        Thread.sleep(2000);
    }
}
