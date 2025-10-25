package org.example.beforeDIP;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Ford Focus", new DieselEngine("Diesel", "Ford", "150 HP"));
    Car car2 = new Car("Ford Focus", new PetrolEngine("Diesel", "Ford", "300 HP"));
    car.setDieselEngine(new DieselEngine("Diesel", "Ford", "200 HP"));
    System.out.println("Car make: " + car.getCarMake());
    car.startCar();
  }
}
