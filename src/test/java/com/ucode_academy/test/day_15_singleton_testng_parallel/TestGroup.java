package com.ucode_academy.test.day_15_singleton_testng_parallel;

import org.testng.annotations.Test;

public class TestGroup {

    @Test (groups = "smoke")
    public void test1(){
        System.out.println("I'm in smoke group");
    }

    @Test (groups = "smoke2")
    public void test2(){
        System.out.println("I'm in smoke2 group");
    }

    @Test (groups = "smoke")
    public void test3(){
        System.out.println("I'm in smoke group");
    }

    @Test (groups = "smoke2")
    public void test4(){
        System.out.println("I'm in smoke2 group");
    }
}
