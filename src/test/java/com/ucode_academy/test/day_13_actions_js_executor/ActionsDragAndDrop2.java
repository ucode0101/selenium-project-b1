package com.ucode_academy.test.day_13_actions_js_executor;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDragAndDrop2 extends TestBase {

    @Test
    public void dragAndDrop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Actions actions = new Actions(driver);

        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement targetCircle = driver.findElement(By.ByCssSelector.cssSelector("div#droptarget"));

        actions.dragAndDrop(smallCircle, targetCircle).perform();

        String message = targetCircle.getText();

        // verify drag and drop success message
        Assert.assertEquals(message, "You did great!", "Failed");

        // print success message
        System.out.println(message);

    }
}
