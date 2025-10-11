package org.example.builder;

import org.example.ParkingLot;
import org.example.factory.PaymentProcessorFactory;
import org.example.parkingStrategy.ParkingStrategy;
import org.example.parkingStrategy.NearestAvailableSpotStrategy;
import org.example.payment.PaymentProcessor;

/**
 * Builder pattern for ParkingLot creation.
 * Makes parking lot creation more flexible and configurable.
 */
public class ParkingLotBuilder {
    private ParkingStrategy strategy;
    private PaymentProcessor paymentProcessor;
    
    public ParkingLotBuilder() {
        // Default values
        this.strategy = new NearestAvailableSpotStrategy();
        this.paymentProcessor = PaymentProcessorFactory.createCardProcessor();
    }
    
    public ParkingLotBuilder withStrategy(ParkingStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    
    public ParkingLotBuilder withPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
        return this;
    }
    
    public ParkingLotBuilder withCardPayment() {
        this.paymentProcessor = PaymentProcessorFactory.createCardProcessor();
        return this;
    }
    
    public ParkingLotBuilder withCashPayment() {
        this.paymentProcessor = PaymentProcessorFactory.createCashProcessor();
        return this;
    }
    
    public ParkingLot build() {
        ParkingLot parkingLot = new ParkingLot(strategy);
        // Override the default payment processor if needed
        if (paymentProcessor != null) {
            parkingLot.setExitPanel(new org.example.panels.ExitPanel(paymentProcessor));
            parkingLot.getExitPanel().setParkingLot(parkingLot);
        }
        return parkingLot;
    }
}