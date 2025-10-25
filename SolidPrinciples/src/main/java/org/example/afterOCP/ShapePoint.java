package org.example.afterOCP;

public class ShapePoint implements Shape {

  @Override
  public double calculateArea() {
    return calculateArbitraryArea();
  }

  private double calculateArbitraryArea() {
    return Math.random() * 100; // Simulating an arbitrary area calculation
  }

  public void dance() {
    System.out.println("ShapePoint is dancing!");
  }
}
