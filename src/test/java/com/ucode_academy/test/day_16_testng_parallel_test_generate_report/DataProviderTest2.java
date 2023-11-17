package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {

    // login to smart bear with different credentials

    @DataProvider(name = "data")
    public Object[][] testData(){
       // Since we are using only one credential, we assume they are different
        return new Object[][] {
                {"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx","Tester","test"},
                {"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx","Tester","test"},
                {"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx","Tester","test"} };
    }



    @Test (dataProvider = "data")
    public void testLogin(String url, String username, String password){

        Driver.getDriver().get(url);

        WebElement usernameInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        Waits.wait(4);

        Driver.quitDriver();
    }
}
