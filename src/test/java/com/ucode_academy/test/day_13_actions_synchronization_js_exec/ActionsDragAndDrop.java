package com.ucode_academy.test.day_13_actions_synchronization_js_exec;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDragAndDrop extends TestBase {

    @Test
    public void dragAndDrop(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement boxA = driver.findElement(By.id("column-a"));

        WebElement boxB  = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(boxA,boxB).perform();

        Waits.wait(4);
    }
}
