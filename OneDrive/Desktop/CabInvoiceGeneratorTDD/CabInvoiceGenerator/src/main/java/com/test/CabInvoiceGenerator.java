package com.test;

public class CabInvoiceGenerator {
    private static final double COST_PER_KM = 10.0;
    private static final int COST_PER_MIN = 1;
    private static final double MINIMUM_FARE = 5.0;


    public double calculateFare(double distance, int time) {
        double totalFare = (COST_PER_KM * distance) + (COST_PER_MIN * time);
        return Math.max(totalFare, MINIMUM_FARE);

    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}