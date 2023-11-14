package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsKeyboardActions extends TestBase {

    @Test
    public void keyboardActions(){
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);

        // enter the text in Upper case with the help of keyDown(Keys.SHIFT)
        actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"hello").keyDown(Keys.SPACE).perform();
        // Release the SHIFT key
        actions.keyUp(Keys.SHIFT).perform();



        Waits.wait(3);
        searchBox.sendKeys("hello");

        Waits.wait(10);
    }
}
