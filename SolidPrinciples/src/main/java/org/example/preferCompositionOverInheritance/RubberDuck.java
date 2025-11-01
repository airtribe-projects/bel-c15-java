package org.example.preferCompositionOverInheritance;

import javax.naming.OperationNotSupportedException;


public class RubberDuck extends BaseDuck {

  public RubberDuck(String hands, String beak, String legs) {
    super(hands, beak, legs);
  }

  @Override
  public void fly() throws OperationNotSupportedException {
    throw new OperationNotSupportedException("Rubber ducks cannot fly");
  }
}
