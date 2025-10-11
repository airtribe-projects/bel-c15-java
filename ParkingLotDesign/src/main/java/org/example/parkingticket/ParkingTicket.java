package org.example.parkingticket;

// ...existing code...
import org.example.Vehicle;


public class ParkingTicket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final String spotId;
    private final String spotType;
    private final long entryTime;

    public ParkingTicket(String ticketId, Vehicle vehicle, String spotId, String spotType) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spotId = spotId;
        this.spotType = spotType;
        this.entryTime = System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotId() {
        return spotId;
    }

    public String getSpotType() {
        return spotType;
    }

    public long getEntryTime() {
        return entryTime;
    }
}