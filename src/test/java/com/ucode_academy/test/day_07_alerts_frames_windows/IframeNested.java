package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeNested {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/nestedframes");

        //focus to the parent iframe using it's id
        driver.switchTo().frame("frame1");

        //locate child iframe
        WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));

        //switch to child iframe
        driver.switchTo().frame(childFrame);


        WebElement childText = driver.findElement(By.xpath("//p"));

        System.out.println(childText.getText());

        //switch to the default frame
        driver.switchTo().defaultContent();

        //if you want to switch to the parent frame instead of default one
        //driver.switchTo().parentFrame();

        //locate the element in default iframe after switching
        WebElement defaultFrameText = driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));

        System.out.println(defaultFrameText.getText());
    }
}
