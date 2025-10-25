package org.example.beforeDIP;

public class DieselEngine extends Engine {
  public String dieselPower;

  public DieselEngine(String engineType, String engineMake, String dieselPower) {
    super(engineType, engineMake);
    this.dieselPower = dieselPower;
  }

  public String getDieselPower() {
    return dieselPower;
  }

  public void setDieselPower(String dieselPower) {
    this.dieselPower = dieselPower;
  }

  @Override
  public void startEngine() {
    System.out.println("Starting diesel engine with power: " + dieselPower);
  }
}
