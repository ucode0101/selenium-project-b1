package com.ucode_academy.utility;

public class Waits {

    public static void wait(int timeInSeconds){

        try {
            Thread.sleep((long) timeInSeconds * 1000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
