package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Engine {
  public String enginePower;

  public Engine(String enginePower) {
    this.enginePower = enginePower;
  }

  public String getEnginePower() {
    return enginePower;
  }

  public void setEnginePower(String enginePower) {
    this.enginePower = enginePower;
  }

  public void display() {
    System.out.println("Engine power: " + enginePower);
  }
}
