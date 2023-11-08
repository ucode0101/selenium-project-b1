package com.ucode_academy.test.day_10_js_executor_upload_actions;

import org.testng.annotations.Test;

public class InvocationCount {


    @Test(invocationCount = 10)
    public void testMethod(){
        System.out.println("Hello world");
    }
}
