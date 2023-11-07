package com.ucode_academy.test.day_09_testng_implicit_wait_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions {
    // 1. Open browser and login to Smartbear software
    //2. Click on View all orders
    //3. Verify Susan McLaren has order on date “01/05/2010”
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    @Test
    public void orderVerification() throws InterruptedException {
        Thread.sleep(3000);

        WebElement allOrders = driver.findElement(By.xpath("//a[text()='View all orders']"));
        allOrders.click();

        WebElement susanOrder = driver.findElement(By.xpath("//tr[6]//td[5]"));

        String actualResul = susanOrder.getText();
        String expectedResult = "01/05/2010";

        Assert.assertEquals(actualResul,expectedResult,"Order date does not match");

        Assert.assertTrue(actualResul.equals(expectedResult),"Incorrect order date");

        // or another example
        Assert.assertTrue(5 == 5);


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.quit();
    }


}
