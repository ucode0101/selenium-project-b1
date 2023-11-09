package com.ucode_academy.test.day_11_uploada_js_executor_alert_window;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeIntro extends TestBase {

    @Test
    public void testIframe() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");

        // locating the iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        // switch to frame

        driver.switchTo().frame(iframe);

        Thread.sleep(3000);

        WebElement textInputField = driver.findElement(By.id("tinymce"));
        // to clear existing texts from text input field
        textInputField.clear();

        Thread.sleep(2000);

        textInputField.sendKeys("Hello");

        // switch the driver back to the main/default frame
        driver.switchTo().defaultContent();


        Thread.sleep(4000);
    }
}
