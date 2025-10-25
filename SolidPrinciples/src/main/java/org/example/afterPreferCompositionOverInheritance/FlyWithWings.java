package org.example.afterPreferCompositionOverInheritance;

public class FlyWithWings implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I'm flying with wings!");
  }
}
