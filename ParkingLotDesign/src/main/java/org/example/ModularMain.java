package org.example;

import org.example.builder.ParkingLotBuilder;
import org.example.factory.ParkingSpotFactory;
import org.example.parkingFloor.ParkingFloor;
import org.example.parkingStrategy.NearestAvailableSpotStrategy;
import org.example.parkingStrategy.RandomSpotStrategy;
import org.example.parkingticket.ParkingTicket;

/**
 * Enhanced Main class demonstrating the improved modular design.
 * Shows the usage of builder pattern, factory pattern, and service layer.
 */
public class ModularMain {
    public static void main(String[] args) throws InterruptedException {
        // Using builder pattern to create parking lot
        ParkingLot lot = new ParkingLotBuilder()
                .withStrategy(new NearestAvailableSpotStrategy())
                .withCardPayment()
                .build();

        // Using factory pattern to create parking spots
        ParkingFloor floor1 = new ParkingFloor("F1");
        floor1.addSpot(ParkingSpotFactory.createSmallSpot("F1-S1"));
        floor1.addSpot(ParkingSpotFactory.createMediumSpot("F1-S2"));
        floor1.addSpot(ParkingSpotFactory.createLargeSpot("F1-S3"));
        lot.addFloor(floor1);

        ParkingFloor floor2 = new ParkingFloor("F2");
        floor2.addSpot(ParkingSpotFactory.createSmallSpot("F2-S1"));
        floor2.addSpot(ParkingSpotFactory.createLargeSpot("F2-S2"));
        lot.addFloor(floor2);


        for (ParkingFloor floor : lot.getFloors()) {
            floor.showFloorDisplay();
        }

        // Vehicles
        Vehicle car1 = new Vehicle("KA-01-1234", VehicleType.CAR);
        Vehicle truck1 = new Vehicle("KA-99-8888", VehicleType.TRUCK);
        Vehicle car2 = new Vehicle("KA-05-5678", VehicleType.CAR);
        Vehicle bus1 = new Vehicle("KA-09-0001", VehicleType.BUS);

        try {
            // Park vehicles using service (this would be the preferred way in a real application)
            System.out.println("\\n=== Parking Vehicles ===");

            // Using the existing panel-based approach for compatibility
            ParkingTicket t1 = lot.getEntryPanel().parkVehicle(car1, lot);
            ParkingTicket t2 = lot.getEntryPanel().parkVehicle(truck1, lot);
            ParkingTicket t3 = lot.getEntryPanel().parkVehicle(car2, lot);
            ParkingTicket t4 = lot.getEntryPanel().parkVehicle(bus1, lot);

            // Simulate time passage
            Thread.sleep(2000);

            System.out.println("\\n=== Unparking Vehicles ===");
            // Unpark vehicles
            lot.getExitPanel().unparkVehicle(t1);
            lot.getExitPanel().unparkVehicle(t2);
            lot.getExitPanel().unparkVehicle(t3);

            // Demonstrate strategy change
            System.out.println("\\n=== Switching to Random Spot Strategy ===");
            lot.changeStrategy(new RandomSpotStrategy());

            Vehicle truck2 = new Vehicle("KA-77-7777", VehicleType.TRUCK);
            ParkingTicket t6 = lot.getEntryPanel().parkVehicle(truck2, lot);

            Thread.sleep(1000);
            lot.getExitPanel().unparkVehicle(t4);
            lot.getExitPanel().unparkVehicle(t6);

        } catch (Exception e) {
            System.err.println("Error during parking operations: " + e.getMessage());
        }
    }
}