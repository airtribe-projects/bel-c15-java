package org.example.afterPreferCompositionOverInheritance;

import org.example.afterPreferCompositionOverInheritance.behaviour.FlyWithLegs;
import org.example.afterPreferCompositionOverInheritance.behaviour.LakeDuck;
import org.example.afterPreferCompositionOverInheritance.behaviour.SwimNoWay;
import org.example.afterPreferCompositionOverInheritance.behaviour.SwimWithBeak;
import org.example.afterPreferCompositionOverInheritance.behaviour.WalkWithHands;


public class Main {
  public static void main(String[] args) {
    BaseDuck baseDuck = new LakeDuck("hands", "beak", "legs", new SwimWithBeak(), new FlyWithLegs(), new WalkWithHands());
    BaseDuck baseDuck2 = new LakeDuck("hands", "beak", "legs", new SwimNoWay(), new FlyWithLegs(), new WalkWithHands());
  }
}
