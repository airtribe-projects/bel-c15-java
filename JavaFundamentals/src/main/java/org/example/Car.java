package org.example;

public abstract class Car implements Vehicle2 {

  public int numberOfWheels;

  public String model;

  public Car() {
    this("Basic Model", 4);
  }

  public Car(String model, int numberOfWheels) {
    this.model = model;
    this.numberOfWheels = numberOfWheels;
  }

  public Car(Car providedCar) {
    this(providedCar.model, providedCar.numberOfWheels);
  }


  public abstract void showCar();
  public void display(Car car) {
    System.out.println("Car model: " + car.model + ", Wheels: " + car.numberOfWheels);
  }

  public void displaySelf() {
    display(this);
  }

  public void startCar() {
    System.out.println("Car is starting...");
    System.out.println("Car model: " + this.model + ", Wheels: " + this.numberOfWheels);
  }

}
