package org.example.payment;

public class CardPaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed card payment of ₹" + amount);
    }
}