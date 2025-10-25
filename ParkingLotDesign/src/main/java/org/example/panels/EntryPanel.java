package org.example.panels;

import org.example.ParkingLot;
import org.example.ParkingSpot;
import org.example.Vehicle;
import org.example.displayPanel.EntryDisplayPanel;
import org.example.parkingStrategy.ParkingStrategy;
import org.example.parkingticket.ParkingTicket;
import org.example.parkingticket.ParkingTicketGenerator;


public class EntryPanel {
    private ParkingStrategy strategy;
    private final EntryDisplayPanel displayPanel;
    private final ParkingTicketGenerator ticketGenerator;

    public EntryPanel(ParkingStrategy strategy) {
        this(strategy, new ParkingTicketGenerator());
    }

    public EntryPanel(ParkingStrategy strategy, ParkingTicketGenerator ticketGenerator) {
        this.strategy = strategy;
        this.displayPanel = new EntryDisplayPanel();
        this.ticketGenerator = ticketGenerator;
    }

    public void changeStrategy(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        ParkingSpot spot = strategy.findSpot(vehicle, parkingLot);
        // Strategy -> Parking lot -> find floors -> floor -> find spot
        ParkingTicket ticket = null;
        if (spot != null) {
            ticket = ticketGenerator.generateTicket(vehicle, spot);
            spot.parkVehicle(vehicle);
            parkingLot.issueTicket(ticket);
        }
        displayPanel.displayTicketIssued(ticket);
        return ticket;
    }
}