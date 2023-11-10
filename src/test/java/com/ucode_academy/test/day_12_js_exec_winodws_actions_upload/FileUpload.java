package com.ucode_academy.test.day_12_js_exec_winodws_actions_upload;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload extends TestBase {

    @Test
    public void uploadFile(){
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));

        fileUpload.sendKeys("/Users/kudratullonegmatov/Documents/test");
        Waits.wait(3);

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement uploadMessage = driver.findElement(By.xpath("//div[@class='example']/h3"));

        Assert.assertTrue(uploadMessage.isDisplayed(),"File was not uploaded");

        Waits.wait(3);
    }
}
