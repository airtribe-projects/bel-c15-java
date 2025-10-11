package org.example.panels;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.config.ParkingConfiguration;
import org.example.displayPanel.ExitDisplayPanel;
import org.example.parkingticket.ParkingTicket;
import org.example.payment.PaymentProcessor;


public class ExitPanel {
    private final ExitDisplayPanel displayPanel;
    private PaymentProcessor paymentProcessor;
    private ParkingLot parkingLot;

    public ExitPanel(PaymentProcessor paymentProcessor) {
        this.displayPanel = new ExitDisplayPanel();
        this.paymentProcessor = paymentProcessor;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        // Allow changing payment processor at runtime
        // e.g., switch from card to mobile payment
        this.paymentProcessor = paymentProcessor;
    }

    public void unparkVehicle(ParkingTicket ticket) {
        if (ticket == null || ticket.getSpotId() == null) return;

        long duration = (System.currentTimeMillis() - ticket.getEntryTime()) / 1000; // seconds
        double cost = ParkingConfiguration.calculateCost(duration);

        // Retrieve the spot from ParkingLot by spotId and remove vehicle
        ParkingSpot spot = parkingLot.getSpotById(ticket.getSpotId());
        if (spot != null) {
            spot.removeVehicle();
        }

        // Remove ticket from active tickets
        parkingLot.removeTicket(ticket.getTicketId());

        paymentProcessor.processPayment(cost);
        displayPanel.displayCost(ticket.getVehicle(), cost);
    }
}