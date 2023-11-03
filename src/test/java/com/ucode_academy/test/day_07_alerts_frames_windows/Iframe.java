package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        //printing the parent frame text
        WebElement parentText = driver.findElement(By.xpath("//h3"));

        System.out.println("Parent text = " + parentText.getText());

        //locate the iframe and store it as web element
        WebElement childFrame = driver.findElement(By.id("mce_0_ifr"));

        //switch to the child frame
        driver.switchTo().frame(childFrame);

        WebElement childText = driver.findElement(By.xpath("//p"));

        System.out.println("Child text = " + childText.getText());


        //switch back to the parent frame
        driver.switchTo().parentFrame();


        WebElement parentText2 = driver.findElement(By.xpath("//h3"));

        //try print the parent text after switching to child iframe
        System.out.println("Parent text = " + parentText2.getText());

    }
}
