package com.ucode_academy.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitDriver {
    public static void main(String[] args) throws InterruptedException {
        // Create driver instance
        WebDriver driver = new ChromeDriver();

        // Load/open/navigate google.com in chrome browser
        driver.get("https://www.google.com/");

        // maximize browser/window
        driver.manage().window().maximize();
        // wait for 4 seconds
        Thread.sleep(4000);

        // close the current browser/tab
        //driver.close();

        // quit all browsers/tabs that was opened, and
        // We will be using driver.quit() mostly whenever we are done with our testing
        driver.quit();

    }
}
