package com.ucode_academy.test.day_11_uploada_js_executor_alert_window;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptWarningAlert extends TestBase {

    @Test
    public void handleJSAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        System.out.println(text);

        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());

        Thread.sleep(2000);
    }


}
