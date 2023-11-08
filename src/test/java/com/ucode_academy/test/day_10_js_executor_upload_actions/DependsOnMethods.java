package com.ucode_academy.test.day_10_js_executor_upload_actions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

    @Test
    public void login(){
        Assert.fail("Explicitly failing the Test"); // One way to fail the assertion explicitly
        //Assert.assertTrue(5 == 99);
        System.out.println("login to Amazon");
    }

    @Test(dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Making purchase");
    }
}
