package org.example.afterBuilder;

public class Main {
  public static void main(String[] args) {
    Car car = new Car.CarBuilder()
        .setEngine("V8")
        .setAirConditioning("Yes")
        .setColor("Red")
        .setGas(true)
        .setSunRoof(true)
        .build();


    Car car2 = new Car.CarBuilder().setEngine("V6").build();
  }
}
