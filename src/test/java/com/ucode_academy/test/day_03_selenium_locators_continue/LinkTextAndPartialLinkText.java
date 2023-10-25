package com.ucode_academy.test.day_03_selenium_locators_continue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. navigate to https://the-internet.herokuapp.com/
click the Frames link using the LinkText locator

2. click the link with "error" string
 */
public class LinkTextAndPartialLinkText {

    public static void main(String[] args) {
//        firstExample();
        secondExample();
    }

    public static void firstExample(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement framesLink = driver.findElement(By.linkText("Frames"));

        framesLink.click();
    }

    public static void secondExample(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement errorLink = driver.findElement(By.partialLinkText("error"));

       errorLink.click();

    }


}

