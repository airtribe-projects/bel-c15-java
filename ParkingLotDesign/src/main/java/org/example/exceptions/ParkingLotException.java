package org.example.exceptions;

/**
 * Custom exception for parking lot related errors.
 * Improves error handling and debugging.
 */
public class ParkingLotException extends Exception {
    public ParkingLotException(String message) {
        super(message);
    }
    
    public ParkingLotException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * Exception thrown when no parking spot is available.
 */
class NoSpotAvailableException extends ParkingLotException {
    public NoSpotAvailableException(String vehicleType) {
        super("No parking spot available for vehicle type: " + vehicleType);
    }
}

/**
 * Exception thrown when ticket is not found.
 */
class TicketNotFoundException extends ParkingLotException {
    public TicketNotFoundException(String ticketId) {
        super("Ticket not found: " + ticketId);
    }
}

/**
 * Exception thrown when spot is not found.
 */
class SpotNotFoundException extends ParkingLotException {
    public SpotNotFoundException(String spotId) {
        super("Parking spot not found: " + spotId);
    }
}