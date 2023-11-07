package com.ucode_academy.test.day_09_testng_implicit_wait_select;

import org.testng.annotations.Test;

public class PrioritizingTest {

    @Test(priority = 2)
    public void cMethod(){
        System.out.println("Hello C");
    }

    @Test (priority = 4)
    public void eMethod(){
        System.out.println("Hello E");
    }

    @Test (priority = 3)
    public void aMethod(){
        System.out.println("Hello A");
    }

    @Test (priority = 1)
    public void bMethod(){
        System.out.println("Hello B");
    }
}
