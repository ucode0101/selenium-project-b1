package com.ucode_academy.test.day_05_xpath_css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWarmUpTask {
    public static void main(String[] args) throws InterruptedException {
        // TC #1: Forgot Password WebElement verification
        //1. Open Chrome browser
        //2. Go to http://the-internet.herokuapp.com//forgot_password
        //3. Locate all the WebElements on the page using XPATH locator only (total of 5)
        //a. “Home” link
        //b. “Forgot password” header
        // c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //4. Verify all WebElements are displayed.

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com//forgot_password");

        Thread.sleep(2000);

        //a. “Home” link

        WebElement homeLink = driver.findElement(By.xpath("//a[@target='_blank']"));

        if (homeLink.isDisplayed()){
            System.out.println("Home Link is displayed");
        } else {
            System.out.println("Home link is not displayed");
        }

        //b. “Forgot password” header

        WebElement forgotPassword = driver.findElement(By.xpath("//div/h2"));
        if (forgotPassword.isDisplayed()){
            System.out.println("Forgot password text is displayed");
        } else{
            System.out.println("Forgot password text is Not displayed");
        }


        // c. “E-mail” text
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));

        if (email.isDisplayed()){
            System.out.println("Email text is displayed");
        } else {
            System.out.println("Email text is Not displayed");
        }

        //d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        if (emailInput.isDisplayed()){
            System.out.println("Email input box is Displayed");
        } else {
            System.out.println("Email input box is Not displayed");
        }

        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@*='submit']"));
        if (retrievePasswordButton.isDisplayed()){
            System.out.println("Retrieve password button is displayed");
        } else {
            System.out.println("Retrieve password button is Not displayed");
        }

        Thread.sleep(5000);

        driver.quit();


    }
}
