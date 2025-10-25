package org.example.coststrategy;

import org.example.SpotType;
import org.example.VehicleType;
import org.example.parkingticket.ParkingTicket;

/**
 * Premium implementation of CostComputationStrategy with higher rates
 * and time-based pricing (surge pricing during peak hours).
 */
public class PremiumCostComputationStrategy implements CostComputationStrategy {
    
    // Premium base rates per hour for different vehicle types
    private static final double CAR_BASE_RATE = 15.0;
    private static final double BUS_BASE_RATE = 35.0;
    private static final double TRUCK_BASE_RATE = 30.0;
    
    // Multipliers for different spot types
    private static final double SMALL_SPOT_MULTIPLIER = 1.2;
    private static final double MEDIUM_SPOT_MULTIPLIER = 1.6;
    private static final double LARGE_SPOT_MULTIPLIER = 2.0;
    
    // Peak hours multiplier (9 AM to 6 PM)
    private static final double PEAK_HOUR_MULTIPLIER = 1.5;
    
    // Minimum charge (e.g., 1 hour minimum for premium)
    private static final double MINIMUM_HOURS = 1.0;
    
    @Override
    public double computeCost(ParkingTicket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Parking ticket cannot be null");
        }
        
        // Calculate parking duration in hours
        long durationMillis = System.currentTimeMillis() - ticket.getEntryTime();
        double durationHours = Math.max(durationMillis / (1000.0 * 60 * 60), MINIMUM_HOURS);
        
        // Get base rate based on vehicle type
        double baseRate = getBaseRateForVehicle(ticket.getVehicle().getType());
        
        // Get multiplier based on spot type
        double spotMultiplier = getSpotMultiplier(ticket.getSpotType());
        
        // Check if it's peak hours
        double peakMultiplier = isPeakHour(ticket.getEntryTime()) ? PEAK_HOUR_MULTIPLIER : 1.0;
        
        // Calculate total cost
        double totalCost = durationHours * baseRate * spotMultiplier * peakMultiplier;
        
        // Round to 2 decimal places
        return Math.round(totalCost * 100.0) / 100.0;
    }
    
    private double getBaseRateForVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return CAR_BASE_RATE;
            case BUS:
                return BUS_BASE_RATE;
            case TRUCK:
                return TRUCK_BASE_RATE;
            default:
                return CAR_BASE_RATE; // Default to car rate
        }
    }
    
    private double getSpotMultiplier(String spotType) {
        try {
            SpotType type = SpotType.valueOf(spotType.toUpperCase());
            switch (type) {
                case SMALL:
                    return SMALL_SPOT_MULTIPLIER;
                case MEDIUM:
                    return MEDIUM_SPOT_MULTIPLIER;
                case LARGE:
                    return LARGE_SPOT_MULTIPLIER;
                default:
                    return SMALL_SPOT_MULTIPLIER;
            }
        } catch (IllegalArgumentException e) {
            return SMALL_SPOT_MULTIPLIER; // Default to small rate
        }
    }
    
    private boolean isPeakHour(long entryTime) {
        // Simple peak hour check (9 AM to 6 PM)
        // In a real implementation, you might want to use proper date/time handling
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTimeInMillis(entryTime);
        int hour = cal.get(java.util.Calendar.HOUR_OF_DAY);
        return hour >= 9 && hour < 18;
    }
}