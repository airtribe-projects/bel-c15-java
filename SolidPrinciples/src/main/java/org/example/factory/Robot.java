package org.example.factory;

public class Robot implements Worker {
  @Override
  public void work() {
    System.out.println("Robot is working");
  }

  @Override
  public void eat() {
    adapterMethod();
  }

  public void adapterMethod() {
    System.out.println("Charging the robot for it to function");
  }
}
