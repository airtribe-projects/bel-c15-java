package org.example;

public interface Vehicle2 extends Vehicle {

  public static String hello = "HELLO";
  void start(String hello);

  void stop();

  void accelerate();

  void brake();
}
