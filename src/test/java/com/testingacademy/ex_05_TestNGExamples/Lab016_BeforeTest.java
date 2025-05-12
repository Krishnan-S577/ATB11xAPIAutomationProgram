package com.testingacademy.ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab016_BeforeTest {
    @BeforeTest
    public void A_getToken(){
        System.out.println("Before GET token");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("Before GET BOOKING");
    }
    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println(" PUT REQUEST");
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }
}
