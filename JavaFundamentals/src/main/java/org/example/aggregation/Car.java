package org.example.aggregation;

public class Car {

  private String model;
  private Engine engine;

  Car() {

  }

  Car(String model, Engine engine) {
    this.model = model;
    this.engine = engine;
  }

  public void showCar() {
    System.out.println("Car model: " + model);
    engine.showEngine();
  }
}
