package org.example.parkingStrategy;

import java.util.List;
import org.example.ParkingLot;
import org.example.parkingFloor.ParkingFloor;
import org.example.ParkingSpot;
import org.example.Vehicle;


public class NearestAvailableSpotStrategy implements ParkingStrategy {
  @Override
  public ParkingSpot findSpot(Vehicle vehicle, ParkingLot parkingLot) {
    for (ParkingFloor floor : parkingLot.getFloors()) {
      if (floor.isUnderMaintenance()) continue;
      ParkingSpot spot = floor.getAvailableSpot(vehicle);
      if (spot != null) return spot;
    }
    return null;
  }
}

// LOT -> FLOORS -> SPOTS -> VEHICLE