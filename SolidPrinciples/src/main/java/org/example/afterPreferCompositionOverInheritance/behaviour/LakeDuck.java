package org.example.afterPreferCompositionOverInheritance.behaviour;

import org.example.afterPreferCompositionOverInheritance.BaseDuck;


public class LakeDuck extends BaseDuck {

  public LakeDuck(String hands, String beak, String legs, SwimBehaviour swimBehavior, FlyBehaviour flyBehaviour,
      WalkBehaviour walkBehavior) {
    super(hands, beak, legs, swimBehavior, flyBehaviour, walkBehavior);
  }

  @Override
  public void fly() {
    flyBehaviour.fly();
  }
}
