package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertsConfirmation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        WebElement confAlertBtn = driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));

        //click the button to invoke the alert pop-up
        confAlertBtn.click();

        //switching to alert
        Alert alert = driver.switchTo().alert();

        //dismissing alert
        alert.dismiss();

        System.out.println(driver.findElement(By.id("result")).getText());
    }
}
