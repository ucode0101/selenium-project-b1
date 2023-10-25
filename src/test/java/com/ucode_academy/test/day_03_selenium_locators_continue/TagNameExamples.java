package com.ucode_academy.test.day_03_selenium_locators_continue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
1. navigate to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
using the tagName locator, verify the validation error message

2. Fill the password form with the tagName locator

 */
public class TagNameExamples {

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        List<WebElement> allInputs = driver.findElements(By.tagName("input"));

        WebElement password = allInputs.get(4);

        password.sendKeys("password");


    }

}
