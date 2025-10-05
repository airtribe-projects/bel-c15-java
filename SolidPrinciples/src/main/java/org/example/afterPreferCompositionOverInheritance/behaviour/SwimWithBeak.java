package org.example.afterPreferCompositionOverInheritance.behaviour;

public class SwimWithBeak implements SwimBehaviour {

  @Override
  public void swim() {
    System.out.println("Swimming with beak.");
  }
}
