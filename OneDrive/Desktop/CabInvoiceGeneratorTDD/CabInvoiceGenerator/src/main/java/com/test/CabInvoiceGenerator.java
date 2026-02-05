package com.test;

public class CabInvoiceGenerator {

    // Normal Ride
    private static final double NORMAL_COST_PER_KM = 10.0;
    private static final int NORMAL_COST_PER_MIN = 1;
    private static final double NORMAL_MIN_FARE = 5.0;

    // Premium Ride
    private static final double PREMIUM_COST_PER_KM = 15.0;
    private static final int PREMIUM_COST_PER_MIN = 2;
    private static final double PREMIUM_MIN_FARE = 20.0;

    public double calculateFare(Ride ride) {
        double fare;

        if (ride.rideType == RideType.PREMIUM) {
            fare = (ride.distance * PREMIUM_COST_PER_KM)
                    + (ride.time * PREMIUM_COST_PER_MIN);
            return Math.max(fare, PREMIUM_MIN_FARE);
        } else {
            fare = (ride.distance * NORMAL_COST_PER_KM)
                    + (ride.time * NORMAL_COST_PER_MIN);
            return Math.max(fare, NORMAL_MIN_FARE);
        }
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0.0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }

        return new InvoiceSummary(rides.length, totalFare);
    }
}
