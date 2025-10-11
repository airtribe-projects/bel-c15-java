package org.example.config;

/**
 * Configuration class for parking lot pricing and rules.
 * Makes pricing and business rules configurable and extensible.
 */
public class ParkingConfiguration {
    private static final double BASE_RATE = 50.0;
    private static final double HOURLY_RATE = 0.1;
    private static final int TICKET_ID_START = 1000;
    
    private ParkingConfiguration() {
        // Utility class
    }
    
    public static double getBaseRate() {
        return BASE_RATE;
    }
    
    public static double getHourlyRate() {
        return HOURLY_RATE;
    }
    
    public static int getTicketIdStart() {
        return TICKET_ID_START;
    }
    
    public static double calculateCost(long durationInSeconds) {
        return BASE_RATE + (durationInSeconds * HOURLY_RATE);
    }
}