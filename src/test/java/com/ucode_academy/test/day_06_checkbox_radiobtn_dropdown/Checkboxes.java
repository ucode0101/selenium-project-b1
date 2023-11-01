package com.ucode_academy.test.day_06_checkbox_radiobtn_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.cssSelector("input[type='checkbox']:nth-child(1)"));

        checkbox1.click();

//        checkbox1.isSelected();

        if (checkbox1.isSelected()){
            System.out.println("test is passed");
        }else {
            System.out.println("test failed");
        }

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        checkbox2.click();

        System.out.println(checkbox2.isSelected());

    }
}
