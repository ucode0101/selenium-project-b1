package com.ucode_academy.test.day_08_testNG;

import org.testng.annotations.*;

public class TestNgFirstExample {


    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test  (priority = 2)
    public void test1(){
        System.out.println("test1");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("test2");
    }


    @BeforeMethod
    public void setUp(){
        System.out.println("BeforeMethod");
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod");
    }


    @BeforeClass
    public void envSetup(){
        System.out.println("@BeforeClass annotation");
    }


    @AfterClass
    public void cleanUp(){
        System.out.println("AfterClass annotation");
    }


}
