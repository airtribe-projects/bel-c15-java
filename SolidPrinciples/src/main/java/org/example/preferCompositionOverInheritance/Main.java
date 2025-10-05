package org.example.preferCompositionOverInheritance;

import javax.naming.OperationNotSupportedException;


public class Main {
  public static void main(String[] args) throws OperationNotSupportedException {
    BaseDuck lakeDuck = new LakeDuck("webbed hands", "flat beak", "short legs");
    lakeDuck.swim();
    lakeDuck.fly();
    lakeDuck.squeak();


    BaseDuck rubberDuck = new RubberDuck("no hands", "rubber beak", "no legs");
    rubberDuck.swim();
    rubberDuck.squeak();
    // rubberDuck.fly();
  }
}
