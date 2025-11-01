package org.example.afterOCP;

public class ShapeRectangle implements Shape {
  private String length;
  private String width;

  public ShapeRectangle(String length, String width) {
    this.length = length;
    this.width = width;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return Double.parseDouble(length) * Double.parseDouble(width);
  }
}
