package org.example.builder;

public class Car {
  private String engine;

  private int wheels;

  private String airConditioning;

  private String color;

  private boolean gas;

  private boolean sunRoof;

  public Car(String engine, int wheels, String airConditioning, String color, boolean gas, boolean sunRoof) {
    this.engine = engine;
    this.wheels = wheels;
    this.airConditioning = airConditioning;
    this.color = color;
    this.gas = gas;
    this.sunRoof = sunRoof;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public String getAirConditioning() {
    return airConditioning;
  }

  public void setAirConditioning(String airConditioning) {
    this.airConditioning = airConditioning;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isGas() {
    return gas;
  }

  public void setGas(boolean gas) {
    this.gas = gas;
  }

  public boolean isSunRoof() {
    return sunRoof;
  }

  public void setSunRoof(boolean sunRoof) {
    this.sunRoof = sunRoof;
  }
}
