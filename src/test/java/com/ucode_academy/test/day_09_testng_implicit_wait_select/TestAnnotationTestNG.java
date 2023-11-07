package com.ucode_academy.test.day_09_testng_implicit_wait_select;

import org.testng.annotations.*;

public class TestAnnotationTestNG {

    @Test
  public void sayHello(){
      System.out.println("Hello world");
  }
  @Ignore
  @Test
    public void sayHi(){
      System.out.println("Hi");
  }

  @BeforeMethod
    public void runBeforeEachMethod(){
      System.out.println("I run before each method");
  }

  @AfterMethod
  public void runAfterEachMethod(){
    System.out.println("I run after each method");
  }

  @BeforeClass
  public void beforeClass(){
    System.out.println("I run before class");
  }

  @AfterClass
  public void afterClass(){
    System.out.println("I run after class");
  }
}
