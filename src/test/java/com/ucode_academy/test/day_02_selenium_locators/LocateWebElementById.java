package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementById {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Find login button (web element), return type WebElement
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        // Click on Login button. It is like clicking with your mouse
        loginButton.click();

        Thread.sleep(7000);

        // closing all browsers, and ending WebDriver session
        driver.quit();



    }
}
