package org.example.beforeDIP;

public class PetrolEngine extends Engine {

  public String petrolType;

    public PetrolEngine(String engineType, String engineMake, String petrolType) {
        super(engineType, engineMake);
        this.petrolType = petrolType;
    }

  public String getPetrolType() {
    return petrolType;
  }

  public void setPetrolType(String petrolType) {
    this.petrolType = petrolType;
  }

  @Override
    public void startEngine() {
        System.out.println("Starting petrol engine of type: " + getEngineType() + " made by: " + getEngineMake());
    }
}
