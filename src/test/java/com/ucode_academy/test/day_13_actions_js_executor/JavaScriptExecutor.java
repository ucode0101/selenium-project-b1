package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends TestBase {

    @Test
    public void javaScriptExecutor(){
        driver.get("https://the-internet.herokuapp.com/");

        WebElement addRemove = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));

        // Explicitly casting the driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // clicking on addRemove button with Javascript Executor
        js.executeScript("arguments[0].click();",addRemove);

        Waits.wait(2);

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));

        js.executeScript("arguments[0].click();",addButton);

        Waits.wait(5);



    }
}
