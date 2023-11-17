package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.annotations.Test;

public class BasicAuth {

    @Test
    public void basicAuth(){
        Driver.getDriver().get(ConfigReader.getProperty("basicAuthUrl"));

        Waits.wait(4);
        Driver.quitDriver();
    }
}
