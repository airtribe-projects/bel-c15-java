package org.example.payment;

public interface PaymentProcessor {
    boolean processPayment(double amount);
}