package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTesting {

    @Test (groups = "dailyTest")
    public void googleTest(){
        // get google url from configuration.properites file
        String url = ConfigReader.getProperty("googleUrl");
        Driver.getDriver().get(url);

        // or we can get url directly using ConfigReader.getProperty("googleUrl") in get() method
        //Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Waits.wait(3);
        Driver.quitDriver();
    }

    @Test(groups = "dailyTest")
    public void amazonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));

        Waits.wait(3);
        Driver.quitDriver();

    }

    @Test(groups = "dailyTest")
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebook"));
        Assert.fail("Failing facebook");
        Waits.wait(3);
        Driver.quitDriver();
    }
}
