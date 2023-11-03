package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");

        //getting the current window handle and storing it
        String mainWindowsHandle = driver.getWindowHandle();

        //this will print the unique id of the current windows
        System.out.println("windowHandle of the current windows " + mainWindowsHandle);

        //printing current page title before clicking the link
        System.out.println("title before click " + driver.getTitle());

        WebElement clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));

        clickHereLink.click();

        //printing current page title before switching to the new windows
        System.out.println("title before switching " + driver.getTitle());


        /*
        getWindowHandles(); returns set of window handles
        we're storing it in allWindowHandles set
         */
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each: allWindowHandles) {
            //switching to every windows
            driver.switchTo().window(each);

            //
            System.out.println("Title of the page from fore-each loop: " + driver.getTitle());
        }


        //We switched the windows and now printing new window handle
         System.out.println(driver.getWindowHandle());

        //switching back to the main windows
        driver.switchTo().window(mainWindowsHandle);

       clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));

       clickHereLink.click();



    }
}
