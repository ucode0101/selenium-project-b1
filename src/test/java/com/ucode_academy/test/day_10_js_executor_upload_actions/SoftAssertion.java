package com.ucode_academy.test.day_10_js_executor_upload_actions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void testSoftAssert(){

        SoftAssert soft = new SoftAssert();
//        soft.fail();
        soft.assertEquals(2, 5);
        System.out.println("Hello world");
        soft.assertTrue(10 == 1);
        System.out.println("Hello again");

        soft.assertAll();


    }

    @Test
    public void testing(){
        System.out.println("hello world");
    }
}
