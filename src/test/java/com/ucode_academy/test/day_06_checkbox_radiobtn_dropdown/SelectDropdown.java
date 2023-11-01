package com.ucode_academy.test.day_06_checkbox_radiobtn_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement optionsDropdown = driver.findElement(By.cssSelector("#dropdown"));

        Select select = new Select(optionsDropdown);


        select.selectByVisibleText("Option 2");
//        select.selectByIndex(1);
//        select.selectByValue("2");

        //deselect selected values
        select.deselectAll();

        //selects the first option from dropdown
        select.getFirstSelectedOption();











    }
}
