package org.example.afterPreferCompositionOverInheritance;

import org.example.afterPreferCompositionOverInheritance.behaviour.FlyBehaviour;
import org.example.afterPreferCompositionOverInheritance.behaviour.SwimBehaviour;
import org.example.afterPreferCompositionOverInheritance.behaviour.WalkBehaviour;


public abstract class BaseDuck {

  private String hands;

  private String beak;

  private String legs;

  public SwimBehaviour swimBehavior;

  public FlyBehaviour flyBehaviour;

  public WalkBehaviour walkBehavior;

  public BaseDuck(String hands, String beak, String legs, SwimBehaviour swimBehavior, FlyBehaviour flyBehaviour,
      WalkBehaviour walkBehavior) {
    this.hands = hands;
    this.beak = beak;
    this.legs = legs;
    this.swimBehavior = swimBehavior;
    this.flyBehaviour = flyBehaviour;
    this.walkBehavior = walkBehavior;
  }

  public void swim() {
    swimBehavior.swim();
  }

  public abstract void fly();

  public void walk() {
    walkBehavior.walk();
  }
}
