package org.example.afterPreferCompositionOverInheritance.behaviour;

public class WalkNoWay implements WalkBehaviour {

  @Override
  public void walk() {
    System.out.println("I can't walk.");
  }
}
