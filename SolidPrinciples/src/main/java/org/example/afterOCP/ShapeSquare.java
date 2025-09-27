package org.example.afterOCP;

public class ShapeSquare implements Shape {
  private String length;

  public ShapeSquare(String length) {
    this.length = length;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  @Override
  public double calculateArea() {
    return Math.pow(Double.parseDouble(length), 2);
  }
}
