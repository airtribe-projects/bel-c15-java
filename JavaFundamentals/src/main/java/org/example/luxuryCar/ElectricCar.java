package org.example.luxuryCar;

import org.example.Car;


public class ElectricCar extends Car {
  private String electricBattery;

  public ElectricCar(String model, int numberOfWheels, String electricBattery) {
    super(model, numberOfWheels);
    this.electricBattery = electricBattery;
  }
  @Override
  public void showCar() {
    System.out.println("Electric Car model: " + model + ", Wheels: " + numberOfWheels + ", Battery: " + electricBattery);
  }

  @Override
  public void start() {
    System.out.println("Electric Car is starting with battery: " + electricBattery);
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
