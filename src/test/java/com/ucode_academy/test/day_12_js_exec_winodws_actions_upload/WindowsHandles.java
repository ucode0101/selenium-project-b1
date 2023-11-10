package com.ucode_academy.test.day_12_js_exec_winodws_actions_upload;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandles extends TestBase {

    @Test
    public void windowHandles(){
        driver.get("https://the-internet.herokuapp.com/windows");

        // Get "Window handle" for current window/tab
        String mainWindow = driver.getWindowHandle();

        System.out.println(mainWindow);

        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));

        // click here to open new window/tab
        clickHere.click();

        // click here to open new window/tab
        clickHere.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);

        // loop through all windows handles and switch to each of them one by one
        for ( String eachWindow : allWindowHandles){
            driver.switchTo().window(eachWindow);
            System.out.println(driver.getTitle());
        }


        //driver.switchTo().window()

        Waits.wait(3);

    }
}
