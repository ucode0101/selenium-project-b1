package com.ucode_academy.test.day_14_explicit_waits_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitAlertIsPresent extends TestBase {

    @Test
    public void waitForAlertPresent(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));

        // we can click it on web element as normally we do, but we want to practice JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",alert);

        Waits.wait(2);

        // create an object/instance of WebDriverWait class
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // wait for javascript alert to be present
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        // we can use accept() directly to accept the alert
        // Or we can switch the driver to alert and acept
        //driver.switchTo().alert().accept();


        Waits.wait(3);
    }
}
