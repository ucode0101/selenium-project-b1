package com.ucode_academy.test.day_08_testNG;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaFaker {

/*
using testng
go to: https://the-internet.herokuapp.com/forgot_password
generate the email and insert it into the email form
click the retrieve password button
 */


    WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void retrieve_the_password() throws InterruptedException {

        WebElement emailInput = driver.findElement(By.name("email"));

        WebElement retrieveBtn = driver.findElement(By.id("form_submit"));

        Faker faker = new Faker();

        emailInput.sendKeys(faker.internet().safeEmailAddress());

        Thread.sleep(3000);

        retrieveBtn.click();


        //assertions

        String expectedMessage = "Internal Server Error";

        WebElement actualMessageLocator = driver.findElement(By.xpath("//h1"));

        Assert.assertTrue(expectedMessage.equals(actualMessageLocator.getText()));


    }

}


