package org.example.assocation;

public class Car {
  private String model;

  public Car(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void showCar() {
    System.out.println("Car model: " + model);
  }
}
