package com.ucode_academy.test.day_03_selenium_locators_continue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*

1. Navigate to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
verify the negative test case -> no login and password is provided, click login btn

2. navigate to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
verify the error message using className


.isDisplayed();

 */

public class ClassNameExample {


    public static void main(String[] args) throws InterruptedException {

//        firstExample();
            secondExample();

    }

    public static void firstExample(){

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement loginBtn = driver.findElement(By.className("button"));

        loginBtn.click();

    }

    public static void secondExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement loginBtn = driver.findElement(By.className("button"));
        WebElement errorMessage = driver.findElement(By.className("error"));

        //steps;
        loginBtn.click();

        Thread.sleep(3000);

        errorMessage.isDisplayed();

        System.out.println(errorMessage.getText());





    }

}
