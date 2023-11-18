package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import com.ucode_academy.test.day_16_testng_parallel_test_generate_report.DataProviderTest;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.annotations.Test;

public class DataDrivenTesting {

    // Data-Driven Testing. Taking the data from external file/class
    @Test (dataProvider = "TestData", dataProviderClass = DataProviderTest.class)
    public void dataDrivenTesting(String ur){

        Driver.getDriver().get(ur);

        Waits.wait(3);
        Driver.quitDriver();


    }


}
