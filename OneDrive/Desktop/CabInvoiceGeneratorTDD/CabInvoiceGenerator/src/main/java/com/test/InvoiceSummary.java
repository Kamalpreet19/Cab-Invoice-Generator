package com.test;

public class InvoiceSummary {
    int numOfRides;
    double totalFare;
    double averageFare;

    InvoiceSummary(int numOfRides, double totalFare){
        this.numOfRides=numOfRides;
        this.totalFare=totalFare;
        this.averageFare=totalFare/numOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && Double.compare(totalFare, that.totalFare) == 0 && Double.compare(averageFare, that.averageFare) == 0;
    }


}
