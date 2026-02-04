package com.test;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare = generator.calculateFare(2.0,5);
        Assert.assertEquals(25.0,fare);
    }


    @Test
    public void givenSmallRide_ShouldReturnMinimumFare(){
        CabInvoiceGenerator generator=new CabInvoiceGenerator();
        double fare=generator.calculateFare(0.0,2);
        Assert.assertEquals(5.0, fare);
    }
}
