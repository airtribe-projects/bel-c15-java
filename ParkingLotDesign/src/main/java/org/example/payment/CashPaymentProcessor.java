package org.example.payment;

public class CashPaymentProcessor implements PaymentProcessor {
    public boolean processPayment(double amount) {
        System.out.println("Processed cash payment of ₹" + amount);
        return true; // Assume cash payments always succeed for this example
    }
}