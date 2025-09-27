package org.example.afterOCP;

public class ShapePoint implements Shape {
  @Override
  public double calculateArea() {
    throw new RuntimeException("Hey i dont know how to calculate area");
  }
}
