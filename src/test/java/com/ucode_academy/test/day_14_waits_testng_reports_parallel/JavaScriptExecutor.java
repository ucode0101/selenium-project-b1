package com.ucode_academy.test.day_14_waits_testng_reports_parallel;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends TestBase {

    @Test
    public void javaScriptExecutor(){

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement hiddenElement = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        // this will verify if web element is visible/displayed
        boolean isVisible = hiddenElement.isDisplayed();
        System.out.println(isVisible);

        // this will return empty string
        String text = hiddenElement.getText();

        System.out.println(text);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String text3 = js.executeScript("return arguments[0].innerHTML;",hiddenElement).toString();
        System.out.println(text3);

        // to click on web element wit jsExecutor
       // js.executeScript("arguments[0].click();",hiddenElement);



    }
}
