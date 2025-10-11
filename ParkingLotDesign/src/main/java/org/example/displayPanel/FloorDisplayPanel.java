package org.example.displayPanel;

import java.util.Map;
import java.util.Set;
import org.example.ParkingSpot;
import org.example.SpotType;


public class FloorDisplayPanel extends DisplayPanel {
    private final String floorId;

    public FloorDisplayPanel(String floorId) {
        this.floorId = floorId;
    }

    public void displayAvailableSpots(Map<SpotType, Set<ParkingSpot>> spotMap, boolean underMaintenance) {
        if (underMaintenance) {
            System.out.println("Display @Floor " + floorId + ": This floor is under maintenance.");
            return;
        }

        System.out.println("Display @Floor " + floorId + ": Available spots:");
        for (Map.Entry<SpotType, Set<ParkingSpot>> entry : spotMap.entrySet()) {
            long available = entry.getValue().stream().filter(spot -> !spot.isOccupied()).count();
            System.out.println("- " + entry.getKey() + ": " + available + " spot(s)");
        }
    }

    @Override
    public void display() {
        System.out.println("Display @Floor " + floorId + ": Welcome to Floor " + floorId);
    }
}
