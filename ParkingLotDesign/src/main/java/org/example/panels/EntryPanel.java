package org.example.panels;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;
import org.example.displayPanel.EntryDisplayPanel;
import org.example.parkingStrategy.ParkingStrategy;
import org.example.parkingticket.ParkingTicket;


public class EntryPanel {
    private ParkingStrategy strategy;
    private final EntryDisplayPanel displayPanel;
    private int ticketCounter = 0;

    public EntryPanel(ParkingStrategy strategy) {
        this.strategy = strategy;
        this.displayPanel = new EntryDisplayPanel();
    }

    public void changeStrategy(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        ParkingSpot spot = strategy.findSpot(vehicle, parkingLot);
        // Strategy -> Parking lot -> find floors -> floor -> find spot
        ParkingTicket ticket = null;
        if (spot != null) {
            spot.parkVehicle(vehicle);
            ticket = new ParkingTicket("TICKET-" + (++ticketCounter), vehicle, spot.getId(), spot.getSpotType().name());
            parkingLot.issueTicket(ticket);
        }
        displayPanel.displayTicketIssued(ticket);
        return ticket;
    }
}