package org.example.panels;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.displayPanel.ExitDisplayPanel;
import org.example.parkingticket.ParkingTicket;
import org.example.payment.PaymentProcessor;
import org.example.coststrategy.CostComputationStrategy;


public class ExitPanel {
    private final ExitDisplayPanel displayPanel;
    private final PaymentProcessor paymentProcessor;
    private final CostComputationStrategy costStrategy;

    public ExitPanel(PaymentProcessor paymentProcessor, CostComputationStrategy costStrategy) {
        this.displayPanel = new ExitDisplayPanel();
        this.paymentProcessor = paymentProcessor;
        this.costStrategy = costStrategy;
    }

    public void unparkVehicle(ParkingTicket ticket, ParkingLot parkingLot) {
        if (ticket == null || ticket.getSpotId() == null) {
            displayPanel.displayError("Invalid parking ticket");
            return;
        }

        // Calculate cost using the strategy pattern
        double cost = costStrategy.computeCost(ticket);

        // Retrieve the spot from ParkingLot by spotId and remove vehicle
        ParkingSpot spot = parkingLot.getSpotById(ticket.getSpotId());
        if (spot != null) {
            spot.removeVehicle();
        } else {
            displayPanel.displayError("Parking spot not found: " + ticket.getSpotId());
            return;
        }

        // Process payment
        boolean paymentSuccess = paymentProcessor.processPayment(cost);
        
        if (paymentSuccess) {
            displayPanel.displayCost(ticket.getVehicle(), cost);
            displayPanel.displayExitSuccess(ticket.getVehicle());
        } else {
            displayPanel.displayError("Payment failed. Please try again.");
        }
    }
}