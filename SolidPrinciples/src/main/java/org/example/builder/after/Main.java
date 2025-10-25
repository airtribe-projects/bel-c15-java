package org.example.builder.after;

public class Main {
  public static void main(String[] args) {


    CarSimpler car = new CarSimpler.CarBuilder()
        .setGas(false)
        .setEngine("engine")
        .setAirConditioning("airconditioning")
        .setSunRoof(false)
        .setColor("red")
        .build();

    car.start();
  }
}
