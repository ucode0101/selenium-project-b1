package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocateWithText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/");

        Thread.sleep(2000);

        WebElement brokenImageLink = driver.findElement(By.xpath("//a[text()='Broken Images']"));

        if (brokenImageLink.isDisplayed()){
            System.out.println(brokenImageLink.getText());
            brokenImageLink.click();
        } else {
            System.out.println("The broken image link/button is not displayed");
        }

        Thread.sleep(4000);

        driver.quit();

    }
}
