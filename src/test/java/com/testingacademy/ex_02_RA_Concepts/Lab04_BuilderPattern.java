package com.testingacademy.ex_02_RA_Concepts;

public class Lab04_BuilderPattern {

    public Lab04_BuilderPattern step1(){
        System.out.println("Step1");
        return this;
    }
    public Lab04_BuilderPattern step2(){
        System.out.println("Step2");
        return this;
    }
    public Lab04_BuilderPattern step3(){
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        Lab04_BuilderPattern bp = new Lab04_BuilderPattern();
        bp.step1().step2().step3();
    }

}
