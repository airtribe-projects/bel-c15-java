package org.example.preferCompositionOverInheritance;

import javax.naming.OperationNotSupportedException;


public abstract class BaseDuck {

  private String hands;

  private String beak;

  private String legs;

  public BaseDuck(String hands, String beak, String legs) {
    this.hands = hands;
    this.beak = beak;
    this.legs = legs;
  }

  public void swim() {
    System.out.println("Base duck swims with " + beak + " beak.");
  }

  public void squeak() {
    System.out.println("Base duck squeaks with " + beak + " beak.");
  }

  public abstract void fly() throws OperationNotSupportedException;

  public String getHands() {
    return hands;
  }

  public void setHands(String hands) {
    this.hands = hands;
  }

  public String getBeak() {
    return beak;
  }

  public void setBeak(String beak) {
    this.beak = beak;
  }

  public String getLegs() {
    return legs;
  }

  public void setLegs(String legs) {
    this.legs = legs;
  }
}
