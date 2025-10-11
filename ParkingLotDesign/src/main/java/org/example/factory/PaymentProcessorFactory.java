package org.example.factory;

import org.example.payment.PaymentProcessor;
import org.example.payment.CardPaymentProcessor;
import org.example.payment.CashPaymentProcessor;

/**
 * Factory for creating payment processors.
 * Makes payment system extensible for new payment methods.
 */
public class PaymentProcessorFactory {
    
    private PaymentProcessorFactory() {
        // Utility class
    }
    
    public static PaymentProcessor createCardProcessor() {
        return new CardPaymentProcessor();
    }
    
    public static PaymentProcessor createCashProcessor() {
        return new CashPaymentProcessor();
    }
    
    public static PaymentProcessor createProcessor(String type) {
        switch (type.toLowerCase()) {
            case "card":
                return new CardPaymentProcessor();
            case "cash":
                return new CashPaymentProcessor();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}