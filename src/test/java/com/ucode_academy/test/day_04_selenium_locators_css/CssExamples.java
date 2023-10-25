package com.ucode_academy.test.day_04_selenium_locators_css;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. navigate to https://demoqa.com/text-box

fill and submit the form using the css locator by #id,  attributes and .classname (single/chaining)

2. navigate to https://demoqa.com/upload-download

click the download by using css - .classname (single/chaining)

3. navigate to https://www.amazon.com/

locate search by css and search for "security cameras"

4. navigate to https://the-internet.herokuapp.com/add_remove_elements/
click add elements two times
delete the second element using css (parent - child)


 */
public class CssExamples {

    public static void main(String[] args) throws InterruptedException {
//        firstExample();

//        secondExample();

        thirdExample();
    }

    public static void firstExample(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));

        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.cssSelector("[type='email']"));

        email.sendKeys("john.doe@gmail.com");

        WebElement cAddress = driver.findElement(By.cssSelector("#currentAddress"));

        cAddress.sendKeys("some dummy data");

        WebElement pAddress = driver.findElement(By.cssSelector("#permanentAddress"));

        pAddress.sendKeys("dummy data");

        WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-primary"));

        submitBtn.click();


    }

    public static void secondExample(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //located the input tag, and then looking for some static attribute
        WebElement searchInput = driver.findElement(By.cssSelector("textarea[name='q']"));

        searchInput.sendKeys("security cameras");

    }

    public static void thirdExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.cssSelector("[onclick='addElement()"));
        addElement.click();
        addElement.click();
        addElement.click();

        WebElement firstChild = driver.findElement(By.cssSelector("#elements > button:first-child"));
        WebElement lastChild = driver.findElement(By.cssSelector("#elements > button:last-child"));
        WebElement nthChild = driver.findElement(By.cssSelector("#elements > button:nth-child(2)"));

        Thread.sleep(2000);

        nthChild.click();


    }


}


