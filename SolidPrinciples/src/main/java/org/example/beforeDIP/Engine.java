package org.example.beforeDIP;

public  abstract class Engine {
  public String engineType;

  public String engineMake;

  public Engine(String engineType, String engineMake) {
    this.engineType = engineType;
    this.engineMake = engineMake;
  }

  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public abstract void startEngine();
}
