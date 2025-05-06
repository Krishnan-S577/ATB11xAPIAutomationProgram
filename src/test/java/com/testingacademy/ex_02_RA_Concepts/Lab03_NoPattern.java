package com.testingacademy.ex_02_RA_Concepts;

public class Lab03_NoPattern {

    // NoDesignPattern

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        Lab03_NoPattern NP = new Lab03_NoPattern();
        NP.step1();
        NP.step2();
        NP.step3("Krishnan");
    }
}


