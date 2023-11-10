package com.ucode_academy.test.day_12_js_exec_winodws_actions_upload;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NestedIframes extends TestBase {

    @Test
    public void nestedIframes(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Parent frame for nested frame
        WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));

        // switch to parent frame
        driver.switchTo().frame(topFrame);

        // locating child frame
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));

        // switch back to parent frame
        driver.switchTo().frame(leftFrame);


        String text = driver.findElement(By.xpath("//body[1]")).getText();
        System.out.println(text);
        Waits.wait(2);

        // switch back to parent frame
        driver.switchTo().parentFrame();

        // locate child frame
        WebElement midFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));

        // switch to child frame
        driver.switchTo().frame(midFrame);

        String midleText = driver.findElement(By.id("content")).getText();
        System.out.println(midleText);

        // switch back to parent frame
        driver.switchTo().parentFrame();

        // locate right frame
        WebElement rightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));

        // switch to child frame
        driver.switchTo().frame(rightFrame);

        String bodyText = driver.findElement(By.xpath("//body")).getText();
        System.out.println(bodyText);

        // switch to main/default content frame
        driver.switchTo().defaultContent();

        // Locate bottom frame
        WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));

        // switch to bottom frame
        driver.switchTo().frame(bottomFrame);

        String bottomText = driver.findElement(By.xpath("//body")).getText();
        System.out.println(bottomText);




    }
}
