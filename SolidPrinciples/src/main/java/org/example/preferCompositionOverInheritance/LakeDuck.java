package org.example.preferCompositionOverInheritance;

public class LakeDuck extends Duck {

  public String waterType;

  public LakeDuck(int hands, int legs, int beak, String waterType) {
    super(hands, legs, beak);
    this.waterType = waterType;
  }

  public void swim() {
    System.out.println("Swimming in the lake with hands and legs");
  }
}
