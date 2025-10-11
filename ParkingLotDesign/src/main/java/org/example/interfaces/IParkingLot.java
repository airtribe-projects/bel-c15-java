package org.example.interfaces;

import org.example.ParkingSpot;
import org.example.parkingFloor.ParkingFloor;
import org.example.parkingticket.ParkingTicket;
import org.example.parkingStrategy.ParkingStrategy;
import java.util.List;

/**
 * Interface for parking lot operations.
 * Enables different implementations of parking lot management.
 */
public interface IParkingLot {
    void addFloor(ParkingFloor floor);
    List<ParkingFloor> getFloors();
    void changeStrategy(ParkingStrategy strategy);
    void issueTicket(ParkingTicket ticket);
    ParkingTicket getTicket(String ticketId);
    ParkingSpot getSpotById(String spotId);
    void removeTicket(String ticketId);
    void isParkingLotFull();
}