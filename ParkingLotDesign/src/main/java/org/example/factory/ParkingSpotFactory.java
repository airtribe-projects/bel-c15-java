package org.example.factory;

import org.example.ParkingSpot;
import org.example.SpotType;

/**
 * Factory for creating parking spots.
 * Centralizes spot creation logic and makes it extensible.
 */
public class ParkingSpotFactory {
    
    private ParkingSpotFactory() {
        // Utility class
    }
    
    public static ParkingSpot createSpot(String id, SpotType type) {
        return new ParkingSpot(id, type);
    }
    
    public static ParkingSpot createSmallSpot(String id) {
        return new ParkingSpot(id, SpotType.SMALL);
    }
    
    public static ParkingSpot createMediumSpot(String id) {
        return new ParkingSpot(id, SpotType.MEDIUM);
    }
    
    public static ParkingSpot createLargeSpot(String id) {
        return new ParkingSpot(id, SpotType.LARGE);
    }
}