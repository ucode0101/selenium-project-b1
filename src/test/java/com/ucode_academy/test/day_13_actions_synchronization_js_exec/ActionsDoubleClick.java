package com.ucode_academy.test.day_13_actions_synchronization_js_exec;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDoubleClick extends TestBase {

    @Test
    public void doubleClick(){
        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        WebElement button = driver.findElement(By.id("doubleClickBtn"));

        actions.doubleClick(button).perform();
        Waits.wait(2);

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        System.out.println(message.getText());
    }

}
