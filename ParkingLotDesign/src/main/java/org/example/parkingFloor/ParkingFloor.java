package org.example.parkingFloor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.example.ParkingSpot;
import org.example.SpotType;
import org.example.Vehicle;
import org.example.displayPanel.FloorDisplayPanel;
import org.example.interfaces.IParkingFloor;


public class ParkingFloor implements IParkingFloor {
    private final String floorId;
    private final Map<SpotType, Set<ParkingSpot>> spotMap;
    private final FloorDisplayPanel displayPanel;
    private boolean underMaintenance;

    public ParkingFloor(String floorId) {
        this.floorId = floorId;
        this.spotMap = new HashMap<>();
        this.displayPanel = new FloorDisplayPanel(floorId);
        this.underMaintenance = false;
        for (SpotType type : SpotType.values()) {
            spotMap.put(type, new HashSet<>());
        }
    }

    public void addSpot(ParkingSpot spot) {
        spotMap.get(spot.getSpotType()).add(spot);
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle) {

      if (underMaintenance) {
        return null;
      }


        for (Map.Entry<SpotType, Set<ParkingSpot>> entry : spotMap.entrySet()) {
            for (ParkingSpot spot : entry.getValue()) {
                if (spot.canFitVehicle(vehicle)) {
                    return spot;
                }
            }
        }
        return null;
    }

    public Set<ParkingSpot> getAllSpots() {
        Set<ParkingSpot> allSpots = new HashSet<>();
        for (Set<ParkingSpot> set : spotMap.values()) {
            allSpots.addAll(set);
        }
        return allSpots;
    }

    public String getFloorId() {
        return floorId;
    }

    public boolean isUnderMaintenance() {
        return underMaintenance;
    }

    public void setUnderMaintenance(boolean status) {
        this.underMaintenance = status;
    }

    public Map<SpotType, Set<ParkingSpot>> getSpotMap() {
        return spotMap;
    }

    public void showFloorDisplay() {
        displayPanel.displayAvailableSpots(spotMap, underMaintenance);
    }

    public boolean isFull() {

        for (Set<ParkingSpot> spots : spotMap.values()) {
            for (ParkingSpot spot : spots) {
                if (!spot.isOccupied()) {
                    return false; // At least one spot is available
                }
            }
        }
        return true; // All spots are occupied
    }
}
