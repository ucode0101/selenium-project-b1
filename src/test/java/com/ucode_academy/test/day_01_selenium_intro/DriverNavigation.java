package com.ucode_academy.test.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {
    public static void main(String[] args) throws InterruptedException {
        // Creating driver instance
        WebDriver driver = new ChromeDriver();

        // Navigating to url/open google.com in Chrome browser
        driver.get("https://www.google.com/");

        // Maximise browser Window
        driver.manage().window().maximize();

        // wait for 3 second
        Thread.sleep(3000);

        // navigate to given url in the same browser tab
        driver.navigate().to("https://www.amazon.com/");

        // wait for 4 seconds
        Thread.sleep(4000);

        // Navigate/go back to previous page (google.com)
        // Is it like clicking on back "<-" button on your browser
        driver.navigate().back();

        // wait for 3 seconds
        Thread.sleep(3000);

        // go to forward the page we visited (amazon.com)
        // It is like clicking on Forward "->" button on your browser
        driver.navigate().forward();

        // wait for 3 seconds
        Thread.sleep(3000);

        // Refresh the page
        // It is like clicking on Refresh/Reload button on  your browser
        driver.navigate().refresh();

        // close the current browser/tab
        driver.close();





    }
}
