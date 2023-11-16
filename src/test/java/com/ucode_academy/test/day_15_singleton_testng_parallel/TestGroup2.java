package com.ucode_academy.test.day_15_singleton_testng_parallel;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.annotations.Test;

public class TestGroup2 {


    @Test (groups = "test1")
    public void amazonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
        Waits.wait(3);
        Driver.quitDriver();
    }

    @Test (groups = "test1")
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebook"));
        Waits.wait(3);
        Driver.quitDriver();
    }

    @Test (groups = "test1")
    public void googleTest(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Waits.wait(3);
        Driver.quitDriver();
    }


}
