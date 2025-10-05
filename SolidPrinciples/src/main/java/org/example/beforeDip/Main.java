package org.example.beforeDip;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "SUV", new DieselEngine("V8", "5000cc", "Diesel"));
    Car car2 = new Car("Suzuki", "SUV", new DieselEngine("V9", "5000cc", "Diesel"));
    Car car3 = new Car("Suzuki", "SUV", new PetrolEngine("V9", "5000cc", "Diesel"));
    // injecting a dependency

    // Setter based injection
    car3.setEngine(new PetrolEngine("V9", "5000cc", "Diesel")); // changing the dependency after

    // field based injection
    car3.engine = new DieselEngine("V9", "5000cc", "Diesel"); // changing the dependency after
    // In order to follow DIP -> DI
    /// constructor
    car.startCar();
    car2.startCar();
    car3.startCar();
  }
}
