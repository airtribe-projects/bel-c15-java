package org.example.parkingticket;

import org.example.ParkingSpot;
import org.example.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ParkingTicketGenerator is responsible for generating parking tickets
 * with unique IDs and proper formatting.
 */
public class ParkingTicketGenerator {
    private static final AtomicInteger ticketCounter = new AtomicInteger(0);
    private static final String TICKET_PREFIX = "PT";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * Generates a new parking ticket for the given vehicle and parking spot.
     * 
     * @param vehicle The vehicle for which the ticket is being generated
     * @param parkingSpot The parking spot where the vehicle is parked
     * @return A new ParkingTicket instance
     * @throws IllegalArgumentException if vehicle or parkingSpot is null
     */
    public ParkingTicket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        if (parkingSpot == null) {
            throw new IllegalArgumentException("Parking spot cannot be null");
        }

        String ticketId = generateTicketId();
        return new ParkingTicket(
            ticketId, 
            vehicle, 
            parkingSpot.getId(), 
            parkingSpot.getSpotType().name()
        );
    }

    /**
     * Generates a unique ticket ID using current date and counter.
     * Format: PT-YYYYMMDD-NNNN
     * 
     * @return A unique ticket ID
     */
    private String generateTicketId() {
        String dateStr = LocalDateTime.now().format(DATE_FORMAT);
        int counter = ticketCounter.incrementAndGet();
        return String.format("%s-%s-%04d", TICKET_PREFIX, dateStr, counter);
    }

    /**
     * Resets the ticket counter (useful for testing purposes).
     */
    public void resetCounter() {
        ticketCounter.set(0);
    }

    /**
     * Gets the current ticket counter value.
     * 
     * @return Current counter value
     */
    public int getCurrentCounter() {
        return ticketCounter.get();
    }
}