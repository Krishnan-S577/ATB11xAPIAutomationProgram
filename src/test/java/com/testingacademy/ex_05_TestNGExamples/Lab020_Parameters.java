package com.testingacademy.ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab020_Parameters {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Demo");
        System.out.println("Running this param!");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Running Chrome");
        }

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Running Firefox");
        }
    }
}
