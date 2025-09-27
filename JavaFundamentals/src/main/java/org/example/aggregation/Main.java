package org.example.aggregation;

public class Main {
  public static void main(String[] args) {
    Engine engine = new Engine("V8");
    Car car = new Car();
    Car car = new Car("V8", engine);
    car.showCar();
  }
  //Car (Parent) -> has-a Engine
}
