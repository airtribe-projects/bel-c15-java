package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Car {
  public String carType;

  public String model;

  @Autowired
  @Qualifier("dieselEngine")
  private Engine engine;

  public Car(@Value("${car.carType}")String carType, @Value("${car.model}") String model, @Qualifier("dieselEngine") Engine engine) {
    this.carType = carType;
    this.model = model;
    this.engine = engine;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void startCar() {
    System.out.println("Car of type " + carType + " and model " + model + " is starting.");
    engine.display();
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
}
