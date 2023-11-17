package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    // To run the same test in different environments/URLs
    // Taking the data from @DataProvider (data source)
    // Every @DataProvider method must return 2-D Object Array

    @DataProvider(name = "TestData")
    public Object[][] testData(){

        return new Object[][] {
                {"https://www.google.com/"},
                {"https://www.amazon.com/"},
                {"https://www.facebook.com/"}};

    }

    @Test(dataProvider = "TestData", groups = "test3")
    public void testInMultiEnvironment(String url){
        Driver.getDriver().get(url);

        Waits.wait(4);

        Driver.quitDriver();
    }
}
