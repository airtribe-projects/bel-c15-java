package org.example.interfaces;

import org.example.Vehicle;

/**
 * Interface for parking spot operations.
 * Enables different implementations of parking spot behavior.
 */
public interface IParkingSpot {
    boolean canFitVehicle(Vehicle vehicle);
    void parkVehicle(Vehicle vehicle);
    void removeVehicle();
    boolean isOccupied();
    String getId();
    Vehicle getParkedVehicle();
}