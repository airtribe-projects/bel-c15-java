package org.example.afterPreferCompositionOverInheritance;

public class BaseDuck {
  private int hands;

  private int legs;

  private int beak;

  public FlyBehaviour flyBehaviour;

  public WalkBehaviour walkBehaviour;

  public SqueakBehaviour squeakBehaviour;



  public BaseDuck(int hands, int legs, int beak,
                  FlyBehaviour flyBehaviour,
                  WalkBehaviour walkBehaviour,
                  SqueakBehaviour squeakBehaviour) {
    this.hands = hands;
    this.legs = legs;
    this.beak = beak;
    this.squeakBehaviour = squeakBehaviour;
    this.flyBehaviour = flyBehaviour;
    this.walkBehaviour = walkBehaviour;

  }

  public void fly() {
    flyBehaviour.fly();
  }

  public void squeak() {
    squeakBehaviour.squeak();
  }

  public void walk() {
    walkBehaviour.walk();
  }

  public void swim() {
    swimBehaviour.swim();
  }
}
