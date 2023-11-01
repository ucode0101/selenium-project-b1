package com.ucode_academy.test.day_06_checkbox_radiobtn_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDeselect {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        WebElement carsDropdown = driver.findElement(By.xpath("//*[@id='cars']"));

        Select select = new Select(carsDropdown);

        select.selectByValue("volvo");

        Thread.sleep(3000);

        select.deselectAll();


    }
}
