package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertsPrompt {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confAlertBtn = driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));

        confAlertBtn.click();

        //switching to alert
        Alert alert = driver.switchTo().alert();

        //sending text to alert
        alert.sendKeys("test");

        Thread.sleep(2000);

        //accepting alert
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println(result.getText());

    }
}
