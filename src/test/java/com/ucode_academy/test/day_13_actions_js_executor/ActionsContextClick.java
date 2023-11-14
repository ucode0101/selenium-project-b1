package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsContextClick extends TestBase {

    @Test
    public void rightClick(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);



       actions.contextClick(box).perform();

       // directly switching to alert and clicking on OK
       driver.switchTo().alert().accept();

        Waits.wait(5);
    }


}
