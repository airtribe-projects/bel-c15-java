package org.example.assocation;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota");
    Driver driver = new Driver("John");
    car.showCar();
    driver.driveCar(car);
  }
}
