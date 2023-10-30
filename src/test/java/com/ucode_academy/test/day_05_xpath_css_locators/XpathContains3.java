package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//button[contains(@onclick,'ement')]"));

        Thread.sleep(2000);

        addButton.click();
        Thread.sleep(4000);

        driver.quit();


    }
}
