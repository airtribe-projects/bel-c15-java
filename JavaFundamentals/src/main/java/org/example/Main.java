package org.example;

import org.example.luxuryCar.ElectricCar;
import org.example.luxuryCar.LuxuryCar;


public class Main {
  public static void main(String[] args) {

    // early binding
    // compile time polymorphism
    // method resolution process

    // late binding
    // run time polymorphism
    // dynamic method dispath
    // based on type of object

  }

  public static void displayFacility(Vehicle vehicle) {
    vehicle.start();
  }
}

