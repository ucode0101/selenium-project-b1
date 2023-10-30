package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/");

        WebElement dynamicElement = driver.findElement(By.xpath("//a[contains(text(),'onload event')]"));

        if (dynamicElement.isDisplayed()){
            System.out.println(dynamicElement.getText());
            dynamicElement.click();
        } else {
            System.out.println("Web element is not visible/displayed");
        }

        Thread.sleep(4000);

        driver.quit();
    }
}
