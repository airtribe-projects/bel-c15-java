package org.example.adapter.before;

public class IndianCharger implements Charger {
  @Override
  public void charge() {
    System.out.println("Charging using Indian charger.");
  }
}
