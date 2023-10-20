package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsReview {
    public static void main(String[] args) throws InterruptedException {

        // Create web driver instance/object
        WebDriver driver = new ChromeDriver();

        // load/navigate/open given url in chrome browser
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // Maximize the browser/window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Get title of the page as a string
        // getTitle() -> this method return the title of current page as a string. Return type String
        String pageTitle = driver.getTitle();

        System.out.println("Title of the page: "+pageTitle);

        // get the current page's URL
        // getCurrentUrl() -> this method returns the URL of the current page as string. Return String
        String pageUrl = driver.getCurrentUrl();

        System.out.println("Page URL: "+pageUrl);

        // get page source
        // getPageSource() -> this method return the source page as string. Return type String
        String pageSource = driver.getPageSource();

        System.out.println("Page source: "+ pageSource);

        // click on web element (button, link etc..)
        // click() -> this method is used to click on web element (button, link etc...) like clicking with mouse

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // enter/type/put text in input/field
        // sendKeys() -> this method is used to type/enter text in input/text area
        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Hello World");

        Thread.sleep(4000);

        driver.quit();



    }
}
