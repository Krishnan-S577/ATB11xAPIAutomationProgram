package com.testingacademy.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab018_Groups {
    @Test(groups = {"sanity", "reg"}, priority = 1)
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"reg"}, priority = 3)
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }
    @Test(groups = {"p1", "reg"}, priority = 2)
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
