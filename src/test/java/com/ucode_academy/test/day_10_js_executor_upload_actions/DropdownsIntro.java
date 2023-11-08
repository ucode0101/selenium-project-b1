package com.ucode_academy.test.day_10_js_executor_upload_actions;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropdownsIntro {

    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver  = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }





    @Test
    public void testDropdown() throws InterruptedException {

        //1: We need to locate the dropdown like any other web element
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        //2: We need to create an object from Select class
        //3: We need to pass that located web element into Select(webElement)
        Select select = new Select(dropdown);

        // selectByVisibleText("text");
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);

        // selectByValue("value");
        select.selectByValue("2");
        Thread.sleep(3000);

        // selectByIndex(index);
        select.selectByIndex(1);
        Thread.sleep(5000);



    }


}
