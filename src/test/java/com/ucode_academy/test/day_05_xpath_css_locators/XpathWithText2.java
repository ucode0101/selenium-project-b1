package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText2 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/");

        WebElement dropDownLink = driver.findElement(By.xpath("//a[.='Dropdown']"));

        if (dropDownLink.isDisplayed()){
            System.out.println(dropDownLink.getText());
            dropDownLink.click();
        } else {
            System.out.println("Dropdown Link is not displayed");
        }
        Thread.sleep(4000);

        driver.quit();

    }
}
