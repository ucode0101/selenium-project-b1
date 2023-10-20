package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        //Thread.sleep(3000);

        // Locating/finding username input by name
        WebElement usernameInput = driver.findElement(By.name("ctl00$MainContent$username"));
        usernameInput.sendKeys("Tester");

        Thread.sleep(2000);

        // Locating/finding password input by id
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        Thread.sleep(2000);
        // Locating/finding login button by class name
        WebElement loginButton = driver.findElement(By.className("button"));

        // Clicking on login button
        loginButton.click();

        Thread.sleep(5000);

        // locating/finding logout button by id
        WebElement logoutButton = driver.findElement(By.id("ctl00_logout"));

        // Clicking on logout button
        logoutButton.click();

        Thread.sleep(5000);
        driver.quit();



    }
}
