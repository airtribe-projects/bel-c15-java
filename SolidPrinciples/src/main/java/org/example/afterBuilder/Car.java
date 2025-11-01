package org.example.afterBuilder;

public class Car {
  private String engine;

  private int wheels;

  private String airConditioning;

  private String color;

  private boolean gas;

  private boolean sunRoof;


  private Car(CarBuilder builderCar) {
    this.engine = builderCar.engine;
    this.wheels = builderCar.wheels;
    this.airConditioning = builderCar.airConditioning;
    this.color = builderCar.color;
    this.gas = builderCar.gas;
    this.sunRoof = builderCar.sunRoof;
  }

  public static class CarBuilder {
    private String engine;

    private int wheels;

    private String airConditioning;

    private String color;

    private boolean gas;

    private boolean sunRoof;

    public CarBuilder setEngine(String engine) {
      this.engine = engine;
      return this;
    }

    public CarBuilder setWheels(int wheels) {
      this.wheels = wheels;
      return this;
    }

    public CarBuilder setAirConditioning(String airConditioning) {
      this.airConditioning = airConditioning;
      return this;
    }

    public CarBuilder setColor(String color) {
      this.color = color;
      return this;
    }

    public CarBuilder setGas(boolean gas) {
      this.gas = gas;
      return this;
    }

    public CarBuilder setSunRoof(boolean sunRoof) {
      this.sunRoof = sunRoof;
      return this;
    }

    public Car build() {
      return new Car(this);
    }


  }

}
