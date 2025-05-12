package com.testingacademy.ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab027_HardAssertion {

    @Test(enabled = false)
    public void test_hardAssertExample() {
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("krishnan","Krishnan");
        System.out.println("End of the program");
    }
    @Test
    public void test_softAssertExample() {
        System.out.println("Start of the program");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("krishnan","Krishnan");
        System.out.println("End of the program");
        softAssert.assertAll();
    }
}
