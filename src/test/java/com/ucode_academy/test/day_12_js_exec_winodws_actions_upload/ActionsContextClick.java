package com.ucode_academy.test.day_12_js_exec_winodws_actions_upload;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsContextClick extends TestBase {

    @Test
    public void rightClick(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement hotSpot = driver.findElement(By.id("hot-spot"));

        // create instance of Actions class
        Actions action = new Actions(driver);

        // Right-click on the box
        action.contextClick(hotSpot).perform();


        // switch to alert and get alert message
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        Waits.wait(2);
    }
}
