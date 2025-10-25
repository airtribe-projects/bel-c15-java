package org.example.coststrategy;

import org.example.SpotType;
import org.example.VehicleType;
import org.example.parkingticket.ParkingTicket;

/**
 * Standard implementation of CostComputationStrategy that calculates
 * parking costs based on duration, vehicle type, and spot type.
 */
public class StandardCostComputationStrategy implements CostComputationStrategy {
    
    // Base rates per hour for different vehicle types
    private static final double CAR_BASE_RATE = 10.0;
    private static final double BUS_BASE_RATE = 25.0;
    private static final double TRUCK_BASE_RATE = 20.0;
    
    // Multipliers for different spot types
    private static final double SMALL_SPOT_MULTIPLIER = 1.0;
    private static final double MEDIUM_SPOT_MULTIPLIER = 1.3;
    private static final double LARGE_SPOT_MULTIPLIER = 1.5;
    
    // Minimum charge (e.g., 30 minutes minimum)
    private static final double MINIMUM_HOURS = 0.5;
    
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
        
        // Calculate total cost
        double totalCost = durationHours * baseRate * spotMultiplier;
        
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
}