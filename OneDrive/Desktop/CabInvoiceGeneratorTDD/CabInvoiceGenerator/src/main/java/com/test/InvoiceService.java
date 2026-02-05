package com.test;

public class InvoiceService {

    private RideRepository rideRepository;
    private CabInvoiceGenerator invoiceGenerator;

    public InvoiceService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
        this.invoiceGenerator = new CabInvoiceGenerator();
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        return invoiceGenerator.calculateFare(rides);
    }
}
