package com.ucode_academy.test.day_13_actions_synchronization_js_exec;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsMoveToElement extends TestBase {

    @Test
    public void moveToElement(){
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        WebElement user1 = driver.findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement name1 = driver.findElement(By.xpath("//*[text()='name: user1']"));

        actions.moveToElement(user1).perform();

        // verify that the text is displayed
        Assert.assertTrue(name1.isDisplayed(), "Name 1 is not displayed");

        // print name1 text
        System.out.println(name1.getText());

        Waits.wait(2);

        WebElement user2 = driver.findElement(By.xpath("//div[@class='figure'][2]"));

        WebElement name2 = driver.findElement(By.xpath("//*[text()='name: user2']"));
        Waits.wait(2);

        actions.moveToElement(user2).perform();

        // verify that the text is displayed
        Assert.assertTrue(name2.isDisplayed(),"Name 2 is not displayed");

        // print name2 text
        System.out.println(name2.getText());

        WebElement user3 = driver.findElement(By.xpath("//div[@class='figure'][3]"));

        WebElement name3 = driver.findElement(By.xpath("//*[text()='name: user3']"));

        actions.moveToElement(user3).perform();

        Waits.wait(2);
        // verify that the text is displayed
        Assert.assertTrue(name3.isDisplayed(),"Name 3 is not displayed");

        // print name3 text
        System.out.println(name3.getText());


    }
}
