package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SendKeysAndHitEnter extends TestBase {

    @Test
    public void googleSearch(){
        driver.get("https://www.google.com/");

        WebElement searchBox  = driver.findElement(By.name("q"));

        // enter the text in search box and hit enter
        //searchBox.sendKeys("java" + Keys.ENTER);

        searchBox.sendKeys("java" + Keys.BACK_SPACE);


        Waits.wait(3);

        searchBox.sendKeys("a"+Keys.CLEAR);
        searchBox.clear();

        Waits.wait(5);
    }
}
