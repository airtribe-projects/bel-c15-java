package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.panels.EntryPanel;
import org.example.panels.ExitPanel;
import org.example.parkingFloor.ParkingFloor;
import org.example.parkingStrategy.ParkingStrategy;
import org.example.parkingticket.ParkingTicket;
import org.example.payment.CardPaymentProcessor;
import org.example.payment.PaymentProcessor;
import org.example.coststrategy.CostComputationStrategy;
import org.example.coststrategy.StandardCostComputationStrategy;


public class ParkingLot {
    private final List<ParkingFloor> floors;
    private final EntryPanel entryPanel;
    private ExitPanel exitPanel;
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    public ParkingLot(ParkingStrategy strategy, PaymentProcessor paymentProcessor, CostComputationStrategy costStrategy) {
        this.floors = new ArrayList<>();
        this.entryPanel = new EntryPanel(strategy);
        this.exitPanel = new ExitPanel(paymentProcessor, costStrategy);
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

    public ParkingSpot getSpotById(String spotId) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.getSpotById(spotId);
            if (spot != null) {
                return spot;
            }
        }
        return null;
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

}
