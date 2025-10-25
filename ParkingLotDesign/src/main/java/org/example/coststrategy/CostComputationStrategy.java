package org.example.coststrategy;

import org.example.parkingticket.ParkingTicket;

/**
 * Strategy interface for computing parking costs.
 * Different implementations can provide various pricing models.
 */
public interface CostComputationStrategy {
    
    /**
     * Computes the parking cost for a given parking ticket.
     * 
     * @param ticket The parking ticket containing vehicle and timing information
     * @return The calculated parking cost
     * @throws IllegalArgumentException if ticket is null or invalid
     */
    double computeCost(ParkingTicket ticket);
}
