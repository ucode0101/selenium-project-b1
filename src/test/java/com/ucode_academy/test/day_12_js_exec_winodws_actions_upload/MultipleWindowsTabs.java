package com.ucode_academy.test.day_12_js_exec_winodws_actions_upload;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindowsTabs extends TestBase {

    @Test
    public void workWithMultiWindowsTabs(){
        driver.get("https://the-internet.herokuapp.com/windows");

        String mainWindowHandle = driver.getWindowHandle();

        // To open following websites in new tabs/windows
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/','_blank');");

        Set<String> allWindowsHandles = driver.getWindowHandles();

        // Loop through all windows handles
        for (String eachWindow : allWindowsHandles){
            Waits.wait(2);
            // switch to each window/tab one by one
            driver.switchTo().window(eachWindow);
            Waits.wait(2);
            // print the title of the page
            System.out.println(driver.getTitle());
            // switch to google
            if (driver.getTitle().contains("Google")){
                break;
            }

        }
        // It should the title of the page where the driver was switched to (Google)
        System.out.println(driver.getTitle());

        // Switch back to the mainWindow
        driver.switchTo().window(mainWindowHandle);
        System.out.println("=======================");
        System.out.println(driver.getTitle());




    }
}
