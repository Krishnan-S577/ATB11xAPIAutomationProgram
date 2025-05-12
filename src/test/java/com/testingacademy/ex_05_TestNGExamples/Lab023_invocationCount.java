package com.testingacademy.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab023_invocationCount {

    @Test(invocationCount = 3)
    public void tc1(){
        System.out.println("Hi");
    }
    @Test(invocationCount = 2)
    public void tc2(){
        System.out.println("Bye");
    }
    @Test
    public void tc3(){
        System.out.println("Hi!!");
    }
}
