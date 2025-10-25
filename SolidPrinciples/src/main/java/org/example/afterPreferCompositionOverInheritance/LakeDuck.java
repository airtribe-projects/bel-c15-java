package org.example.afterPreferCompositionOverInheritance;

public class LakeDuck extends BaseDuck{

  public LakeDuck(int hands, int legs, int beak,
                  FlyBehaviour flyBehaviour,
                  WalkBehaviour walkBehaviour,
                  SqueakBehaviour squeakBehaviour) {
    super(hands, legs, beak, flyBehaviour, walkBehaviour, squeakBehaviour);
  }

  public void setSwimBehaviour(FlyBehaviour behaviour) {
    super.flyBehaviour = behaviour;
  }
}
