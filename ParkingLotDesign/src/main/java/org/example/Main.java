package org.example;

import org.example.parkingFloor.ParkingFloor;
import org.example.parkingStrategy.NearestAvailableSpotStrategy;
import org.example.parkingStrategy.RandomSpotStrategy;
import org.example.parkingticket.ParkingTicket;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot lot = new ParkingLot(new NearestAvailableSpotStrategy());
        // step by step -> builder pattern

        ParkingFloor floor1 = new ParkingFloor("F1");
        floor1.addSpot(new ParkingSpot("F1-S1", SpotType.SMALL));
        floor1.addSpot(new ParkingSpot("F1-S2", SpotType.MEDIUM));
        floor1.addSpot(new ParkingSpot("F1-S3", SpotType.LARGE));
        lot.addFloor(floor1);

        ParkingFloor floor2 = new ParkingFloor("F2");
        floor2.addSpot(new ParkingSpot("F2-S1", SpotType.SMALL));
        floor2.addSpot(new ParkingSpot("F2-S2", SpotType.LARGE));
        lot.addFloor(floor2);

        ParkingFloor floor3 = new ParkingFloor("F3");
        floor3.setUnderMaintenance(true);
        floor3.addSpot(new ParkingSpot("F3-S1", SpotType.MEDIUM));
        lot.addFloor(floor3);

        for (ParkingFloor floor : lot.getFloors()) {
            floor.showFloorDisplay();
        }

        // Vehicles
        Vehicle car1 = new Vehicle("KA-01-1234", VehicleType.CAR);
        Vehicle truck1 = new Vehicle("KA-99-8888", VehicleType.TRUCK);
        Vehicle car2 = new Vehicle("KA-05-5678", VehicleType.CAR);
        Vehicle bus1 = new Vehicle("KA-09-0001", VehicleType.BUS);

        // Park vehicles
        ParkingTicket t1 = lot.getEntryPanel().parkVehicle(car1, lot);
        ParkingTicket t2 = lot.getEntryPanel().parkVehicle(truck1, lot);
        ParkingTicket t3 = lot.getEntryPanel().parkVehicle(car2, lot);
        ParkingTicket t4 = lot.getEntryPanel().parkVehicle(bus1, lot); // likely to fail if no large spot available


        // Simulate time passage
        Thread.sleep(2000);

        // Unpark vehicles
        lot.getExitPanel().unparkVehicle(t1);
        lot.getExitPanel().unparkVehicle(t2);
        lot.getExitPanel().unparkVehicle(t3);

        // Change strategy and retry parking
        System.out.println("Switching to Random Spot Strategy...");
        lot.changeStrategy(new RandomSpotStrategy());

        Vehicle truck2 = new Vehicle("KA-77-7777", VehicleType.TRUCK);
        ParkingTicket t6 = lot.getEntryPanel().parkVehicle(truck2, lot);

        Thread.sleep(1000);
        lot.getExitPanel().unparkVehicle(t4);
        lot.getExitPanel().unparkVehicle(t6);
    }
}