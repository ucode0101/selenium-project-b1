package com.ucode_academy.test.day_15_singleton_testng_parallel;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginToSmartBear extends TestBase {

    @Test
    public void simpleLoginSmartBear(){
        driver.get(ConfigReader.getProperty("smartBearUrl"));

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));

        // store the username in a string
       //  username = ConfigReader.getProperty("username");
        usernameInput.sendKeys(ConfigReader.getProperty("username"));

        WebElement pwdInput = driver.findElement(By.id("ctl00_MainContent_password"));
        pwdInput.sendKeys(ConfigReader.getProperty("password"));

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        Waits.wait(3);
    }

}
