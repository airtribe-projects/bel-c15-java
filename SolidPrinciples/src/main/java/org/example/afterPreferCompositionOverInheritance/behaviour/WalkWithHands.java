package org.example.afterPreferCompositionOverInheritance.behaviour;

public class WalkWithHands implements WalkBehaviour {

  @Override
  public void walk() {
    System.out.println("Walking with hands.");
  }
}
