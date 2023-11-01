package com.ucode_academy.test.day_06_checkbox_radiobtn_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        WebElement impressiveButton = driver.findElement(By.xpath("//label[text()='Impressive']/preceding-sibling::input"));


        if(!impressiveButton.isSelected()){
            impressiveButton.click();
        }

        System.out.println(impressiveButton.isSelected());





    }
}
