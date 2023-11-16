package com.ucode_academy.test.day_15_singleton_testng_parallel;

import com.ucode_academy.base.TestBase;
import com.ucode_academy.utility.ConfigReader;
import org.testng.annotations.Test;

public class TestReadingDataFromConfig extends TestBase {

    @Test
    public void testReadingDataFromConfigFile(){
        // this is this hard coded
        // every time was pass url manually
        //driver.get("https://www.google.com/");

        // If you want to store the url in a string
        String url = ConfigReader.getProperty("googleUrl");

        // if you want to ConfigReader.getProperty() directly
        driver.get(ConfigReader.getProperty("amazon"));
    }
}
