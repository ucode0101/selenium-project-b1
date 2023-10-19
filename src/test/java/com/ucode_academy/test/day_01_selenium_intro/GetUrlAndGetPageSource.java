package com.ucode_academy.test.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndGetPageSource {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String pageUrl = driver.getCurrentUrl();

        String pageSource = driver.getPageSource();

        System.out.println("Current page URL: "+ pageUrl);

        System.out.println("================================");
        System.out.println("Page source: " + pageSource);

    }
}
