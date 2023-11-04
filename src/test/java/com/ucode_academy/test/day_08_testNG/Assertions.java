package com.ucode_academy.test.day_08_testNG;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assertions {

    WebDriver driver;


    @AfterMethod
    public void tearDown(){
     driver.quit();
    }

    @BeforeMethod
    public void setUp(){

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }



    /*
    Testcase 1:
    Go to the Google home page
    Verify the page title
     */


    //assertEquals();

//    @Ignore
    @Test
    public void verify_the_title(){

        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        /*
        We did the actual assertion
        actualTitle.equals(expectedTitle) --> is returning boolean
        we are passing the value to Assert.assertTrue()
         */

        Assert.assertEquals(actualTitle, expectedTitle);


    }


     /*
    Testcase 2:
    Go to the Google home page
    Search for "test"
    Verify using assertTrue() that the title includes the searched item
     */

    //assertTrue();

    @Test
    public void verify_the_google_search_title(){

        String searchItem = "test";

        WebElement searchInput = driver.findElement(By.name("q"));

        searchInput.sendKeys(searchItem + Keys.ENTER);

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(searchItem));


    }


}
