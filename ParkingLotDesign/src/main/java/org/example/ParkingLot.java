package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.factory.PaymentProcessorFactory;
import org.example.interfaces.IParkingLot;
import org.example.panels.EntryPanel;
import org.example.panels.ExitPanel;
import org.example.parkingFloor.ParkingFloor;
import org.example.parkingStrategy.ParkingStrategy;
import org.example.parkingticket.ParkingTicket;


public class ParkingLot implements IParkingLot  {
    private final List<ParkingFloor> floors;
    private final EntryPanel entryPanel;
    private ExitPanel exitPanel;
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    public ParkingLot(ParkingStrategy strategy) {
        this.floors = new ArrayList<>();
        this.entryPanel = new EntryPanel(strategy);
        this.exitPanel = new ExitPanel(PaymentProcessorFactory.createCardProcessor());
        this.exitPanel.setParkingLot(this);
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public EntryPanel getEntryPanel() {
        return entryPanel;
    }

    public ExitPanel getExitPanel() {
        return exitPanel;
    }

    public void changeStrategy(ParkingStrategy strategy) {
        entryPanel.changeStrategy(strategy);
    }

    public void issueTicket(ParkingTicket ticket) {
        activeTickets.put(ticket.getTicketId(), ticket);
    }

    public ParkingTicket getTicket(String ticketId) {
        return activeTickets.get(ticketId);
    }

    public void setExitPanel(ExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }


    public void isParkingLotFull() {
        for (ParkingFloor floor : floors) {
            if (!floor.isFull()) {
                System.out.println("Parking lot is not full.");
                return;
            }
        }
        System.out.println("Parking lot is full.");
    }

    public ParkingSpot getSpotById(String spotId) {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getAllSpots()) {
                if (spot.getId().equals(spotId)) {
                    return spot;
                }
            }
        }
        return null;
    }

    public void removeTicket(String ticketId) {
        activeTickets.remove(ticketId);
    }

}
