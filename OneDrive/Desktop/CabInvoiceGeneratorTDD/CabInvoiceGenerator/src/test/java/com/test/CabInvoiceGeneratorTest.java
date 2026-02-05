package com.test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare = generator.calculateFare(2.0, 5);
        assertEquals(fare, 25.0);
    }

    @Test
    public void givenSmallRide_ShouldReturnMinimumFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double fare = generator.calculateFare(0.0, 2);
        assertEquals(fare, 5.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnAggregateFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0, 2)
        };

        InvoiceSummary summary = generator.calculateFare(rides);
        InvoiceSummary expectedSummary = new InvoiceSummary(2, 30.0);

        assertEquals(summary, expectedSummary);
    }
}
