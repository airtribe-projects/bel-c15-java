package org.example;

// has a vehicle
public class ParkingSpot {
    private final String id;
    private final SpotType spotType;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(String id, SpotType spotType) {
        this.id = id;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
      if (isOccupied) {
        return false;
      }

        return switch (vehicle.getType()) {
            case CAR -> spotType == SpotType.SMALL || spotType == SpotType.MEDIUM;
            case BUS, TRUCK -> spotType == SpotType.LARGE;
        };
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getId() {
        return id;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
