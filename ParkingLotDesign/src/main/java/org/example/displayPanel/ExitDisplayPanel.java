package org.example.displayPanel;

import org.example.Vehicle;


public class ExitDisplayPanel extends DisplayPanel {
    public void displayCost(Vehicle vehicle, double cost) {
        System.out.println("Display @Exit: Vehicle " + vehicle.getLicenseNumber() + " - Total cost: ₹" + cost);
    }

    public void displayError(String errorMessage) {
        System.out.println("Display @Exit: ERROR - " + errorMessage);
    }

    public void displayExitSuccess(Vehicle vehicle) {
        System.out.println("Display @Exit: Vehicle " + vehicle.getLicenseNumber() + " exited successfully. Thank you!");
    }

    @Override
    public void display() {
        System.out.println("Display @Exit: Thank you! Drive safe.");
    }
}
