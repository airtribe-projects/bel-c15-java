package org.example.afterPreferCompositionOverInheritance.behaviour;

public class FlyWithLegs implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("Flying with legs.");
  }
}
