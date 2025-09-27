package org.example;

public interface Vehicle {
  default void start() {
    System.out.println("Vehicle is starting...");
    internalMethod();
  }

  void stop();

  void accelerate();

  void brake();

  private void internalMethod() {
    System.out.println("This is a private method inside the Vehicle interface");
  }
}
