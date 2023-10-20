package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttributeMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // locating/finding element by class name
        WebElement infoText = driver.findElement(By.className("info"));

        // get/retrieve inner txt/txt between opening & closing tags
        // and store in String variable
        String txtOfElement = infoText.getText();

        System.out.println("Element text: "+ txtOfElement);

        // get/retrieve attribute value
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        String getAttributeValue = loginButton.getAttribute("class");

        System.out.println("Attribute value: "+ getAttributeValue);

        Thread.sleep(2000);

        driver.quit();

    }
}
