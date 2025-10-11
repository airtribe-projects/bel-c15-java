package org.example.parkingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.example.ParkingLot;
import org.example.parkingFloor.ParkingFloor;
import org.example.ParkingSpot;
import org.example.Vehicle;


public class RandomSpotStrategy implements ParkingStrategy {
  @Override
  public ParkingSpot findSpot(Vehicle vehicle, ParkingLot parkingLot) {
    List<ParkingFloor> floors = new ArrayList<>(parkingLot.getFloors());
    Collections.shuffle(floors);
    for (ParkingFloor floor : floors) {
      if (floor.isUnderMaintenance()) continue;
      ParkingSpot spot = floor.getAvailableSpot(vehicle);
      if (spot != null) return spot;
    }
    return null;
  }
}