package org.example.afterOCP;

public class ShapeCircle implements Shape {
  private String radius;

  public ShapeCircle(String radius) {
    this.radius = radius;
  }

  public String getRadius() {
    return radius;
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(Double.parseDouble(radius), 2);
  }
}
