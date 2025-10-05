package org.example.beforeDip;

public class DieselEngine extends Engine {

  private String dieselDensity;

  public DieselEngine(String engineType, String engineMake, String dieselDensity) {
    super(engineType, engineMake);
    this.dieselDensity = dieselDensity;
  }

  @Override
  public void startEngine() {
    System.out.println("Starting diesel engine of type: " + getEngineType() + " and make: " + getEngineMake() + " with diesel density: " + dieselDensity);
  }
}
