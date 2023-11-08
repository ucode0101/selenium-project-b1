package com.ucode_academy.test.day_10_js_executor_upload_actions;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdowns2 extends TestBase {




    @Test
    public void testDropdown() throws InterruptedException {


        driver.get("https://demoqa.com/select-menu");

        WebElement oldStyleSelect = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(oldStyleSelect);

        // getFirstSelectedOption()
        String firstSelectedOption = select.getFirstSelectedOption().getText();
        System.out.println(firstSelectedOption);

        // selectByVisibleText()
        select.selectByVisibleText("Blue");
        Thread.sleep(2000);

        // selectByValue()
        select.selectByValue("5");

        Thread.sleep(2000);

        // selectByIndex()
        select.selectByIndex(8);

        // To get/return all the options as List of Web Elements
        List<WebElement> allOptions = select.getOptions();

        // Loop and select each option one by one
        for (WebElement eachOption : allOptions){
            // storing visible text from each option
            String visibleText = eachOption.getText();

            select.selectByVisibleText(visibleText);
            Thread.sleep(2000);

        }

        Thread.sleep(3000);

    }

    @Test
    public void testNonSelectDropdown() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown = driver.findElement(By.xpath("//div[text()='Select Title']"));
        dropdown.click();

        WebElement element = driver.findElement(By.xpath("//div[text()='Mrs.']"));
        element.click();
        Thread.sleep(4000);
    }
}
