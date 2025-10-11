package org.example.interfaces;

import org.example.Vehicle;
import org.example.ParkingSpot;

/**
 * Interface for parking floor operations.
 * Enables different implementations of parking floor management.
 */
public interface IParkingFloor {
    void addSpot(ParkingSpot spot);
    ParkingSpot getAvailableSpot(Vehicle vehicle);
    String getFloorId();
    boolean isUnderMaintenance();
    void setUnderMaintenance(boolean status);
    void showFloorDisplay();
    boolean isFull();
}