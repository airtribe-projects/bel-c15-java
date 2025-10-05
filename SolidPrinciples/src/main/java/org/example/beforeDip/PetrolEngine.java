package org.example.beforeDip;

public class PetrolEngine extends Engine {

  private String petrolType;
  public PetrolEngine(String engineType, String engineMake, String petrolType) {
    super(engineType, engineMake);
    this.petrolType = petrolType;
  }

  @Override
  public void startEngine() {
    System.out.println("Starting petrol engine of type: " + getEngineType() + " and make: " + getEngineMake() + " with petrol type: " + petrolType);
  }
}
