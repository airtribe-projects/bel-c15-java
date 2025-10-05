package org.example.preferCompositionOverInheritance;

public class LakeDuck extends BaseDuck {


  public LakeDuck(String hands, String beak, String legs) {
    super(hands, beak, legs);
  }

  public void swim() {
    System.out.println("Lake duck swims with " + getBeak() + " beak.");
  }

  @Override
  public void fly() {

  }
}
