package com.salesforce.datorama;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample {

    @Test(groups = "stable")
    public void workingTest(){
        Assert.assertEquals(1,1);
    }

    @Test(groups = "unstable")
    public void noneWorkingTest(){
        Assert.assertEquals(1,2);
    }
}
