package org.example.afterPreferCompositionOverInheritance;

public class Main {
  public static void main(String[] args) {
    BaseDuck baseDuck = new LakeDuck(1,2,2, new FlyNoWay(), new WalkNormal(), new SqueakWithNoises());
  }
}
