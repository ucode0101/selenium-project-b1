package com.ucode_academy.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    // This private Constructor prevents creating instance/object from this class
    // This is what makes it Singleton
    private Driver(){

    }

    private static WebDriver driver;

    // public getter method
    public static WebDriver getDriver(){
        if (driver == null){

            String browserName = ConfigReader.getProperty("browser");
            browserName = browserName.toLowerCase();

            switch (browserName){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "chrome-headless":
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;

    }

    public static void quitDriver(){

        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


}
