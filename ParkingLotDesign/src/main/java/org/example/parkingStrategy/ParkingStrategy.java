package org.example.parkingStrategy;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;


public interface ParkingStrategy {
    ParkingSpot findSpot(Vehicle vehicle, ParkingLot parkingLot);
}