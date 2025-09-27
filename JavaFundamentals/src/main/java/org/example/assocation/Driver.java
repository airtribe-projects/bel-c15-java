package org.example.assocation;

public class Driver {

  private String name;

  public Driver(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void driveCar(Car car) {
    car.showCar();
  }
}
