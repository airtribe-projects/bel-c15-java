package org.example.luxuryCar;

import org.example.Car;
import org.example.Human;


// Car -> Parent
// LuxuryCar -> Child
public class LuxuryCar extends Car {

  public String airConditioner;

  public String model;

  public LuxuryCar() {
    airConditioner = "Default AC";
  }

  @Override
  public void showCar() {
    System.out.println("Car model: " + model + ", Wheels: " + numberOfWheels);
    System.out.println("Air Conditioner: " + airConditioner);
  }

  public LuxuryCar(String model, int numberOfWheels, String airConditioner) {
    super(model, numberOfWheels);
    this.airConditioner = airConditioner;
  }

  public void showLuxuryCar() {
    showCar();
    System.out.println("Luxury Car model: " + this.model + ", Wheels: " + numberOfWheels + ", AC: " + airConditioner);
  }

  @Override
  public void startCar() {
    super.startCar();
    System.out.println("Air conditioner started");

  }

  @Override
  public void start() {

  }

  @Override
  public void start(String hello) {

  }

  @Override
  public void stop() {

  }

  @Override
  public void accelerate() {

  }

  @Override
  public void brake() {

  }
}

// PROTECTED -> DEFAULT + Subclasses outside the package

//