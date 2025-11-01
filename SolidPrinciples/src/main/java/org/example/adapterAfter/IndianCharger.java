package org.example.adapterAfter;


public class IndianCharger implements Charger {

  public IndianCharger() {

  }

  @Override
  public void charge() {
    System.out.println("Charging with Indian charger.");
  }
}
