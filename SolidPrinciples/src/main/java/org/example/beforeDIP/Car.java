package org.example.beforeDIP;

public class Car {

  public String carMake;

  public Engine engine;

  public Car(String carMake, Engine engine) {
    this.carMake = carMake;
    this.engine = engine;
  }

  public String getCarMake() {
    return carMake;
  }

  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setDieselEngine(DieselEngine dieselEngine) {
    this.engine = dieselEngine;
  }

  public void startCar() {
    System.out.println("Starting car: " + carMake);
    engine.startEngine();
  }
}
