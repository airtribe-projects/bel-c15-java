package org.example.afterPreferCompositionOverInheritance.behaviour;

public class SwimNoWay implements SwimBehaviour {

  @Override
  public void swim() {
    System.out.println("I can't swim.");
  }
}
