package com.ucode_academy.test.day_16_testng_parallel_test_generate_report;

import org.testng.annotations.Test;

public class ExpectedExceptionsTest {

    // We are telling/letting TestNG know that we are expected ArithmeticException
    // So ignore that exception/not fail when it happens
    @Test (expectedExceptions = Exception.class)
    public void testExpectedException(){
        System.out.println( 5 / 0);


        System.out.println("Hello World");
    }
}
