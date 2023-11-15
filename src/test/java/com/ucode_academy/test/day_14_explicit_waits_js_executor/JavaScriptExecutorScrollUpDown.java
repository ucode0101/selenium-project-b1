package com.ucode_academy.test.day_14_explicit_waits_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorScrollUpDown extends TestBase {

    @Test
    public void jsExecutorScrollUpDown(){
        driver.get("https://www.amazon.com/");

        WebElement backToTopButton = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));

        JavascriptExecutor js = (JavascriptExecutor)  driver;

        // To scroll down to specific web element
        // in this example element is all the way down the page
        js.executeScript("arguments[0].scrollIntoView(true);",backToTopButton);

        Waits.wait(3);
        WebElement registerButton = driver.findElement(By.xpath("//a[text()='Registry']"));

        // Scroll up to specified web element
        js.executeScript("arguments[0].scrollIntoView(true);",registerButton);

        Waits.wait(3);

        WebElement scrollToMiddleElement = driver.findElement(By.xpath("(//span[contains(text(),'Best Sellers')])[4]"));

        js.executeScript("arguments[0].scrollIntoView(true);",scrollToMiddleElement);

        Waits.wait(4);




    }
}
