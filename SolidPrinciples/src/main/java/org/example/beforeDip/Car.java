package org.example.beforeDip;

public class Car {

  private String carType;

  private String carMake;

  public Engine engine;

  public Car(String carMake, String carType, Engine engine) {
    this.carMake = carMake;
    this.carType = carType;
    this.engine = engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void startCar() {
    System.out.println("Starting car of type: " + carType + " and make: " + carMake);
    engine.startEngine();
  }
}
