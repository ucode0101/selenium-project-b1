package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/");

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'UI')]"));

        System.out.println(element.getText());

        element.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
