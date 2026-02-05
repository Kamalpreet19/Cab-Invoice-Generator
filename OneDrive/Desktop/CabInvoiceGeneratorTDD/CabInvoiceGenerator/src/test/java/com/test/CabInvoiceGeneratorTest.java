package com.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenNormalRide_ShouldReturnFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Ride ride = new Ride(2.0, 5, RideType.NORMAL);

        double fare = generator.calculateFare(ride);
        assertEquals(fare, 25.0);
    }

    @Test
    public void givenPremiumRide_ShouldReturnPremiumFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        Ride ride = new Ride(2.0, 5, RideType.PREMIUM);

        double fare = generator.calculateFare(ride);
        assertEquals(fare, 40.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnAggregateFare() {
        CabInvoiceGenerator generator = new CabInvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),   // 25
                new Ride(1.0, 1, RideType.PREMIUM)  // min 20
        };

        InvoiceSummary summary = generator.calculateFare(rides);
        InvoiceSummary expected = new InvoiceSummary(2, 45.0);

        assertEquals(summary, expected);
    }

    @Test
    public void givenUserId_ShouldReturnInvoiceSummary() {
        RideRepository repository = new RideRepository();

        Ride[] rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(1.0, 1, RideType.PREMIUM)
        };

        repository.addRides("user1", rides);

        InvoiceService service = new InvoiceService(repository);
        InvoiceSummary summary = service.getInvoiceSummary("user1");

        InvoiceSummary expected = new InvoiceSummary(2, 45.0);
        assertEquals(summary, expected);
    }
}
