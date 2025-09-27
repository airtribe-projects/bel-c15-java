package org.example.beforeOCP;

public class AreaCalculator {
  public double calculateArea(Object object) {
    if (object instanceof Circle) {
      Circle circle = (Circle) object;
      return Math.PI * Double.parseDouble(circle.getRadius()) * Double.parseDouble(circle.getRadius());
    } else if (object instanceof ShapeRectangle) {
      ShapeRectangle rectangle = (ShapeRectangle) object;
      return Double.parseDouble(rectangle.getLength()) * Double.parseDouble(rectangle.getWidth());
    } else if (object instanceof ShapeSquare) {
      ShapeSquare square = (ShapeSquare) object;
      return Double.parseDouble(square.getLength()) * Double.parseDouble(square.getLength());
    } else if (object instanceof ShapeRhombus) {
      ShapeRhombus rhombus = (ShapeRhombus) object;
      return (Double.parseDouble(rhombus.getDiagonal1()) * Double.parseDouble(rhombus.getDiagonal2())) / 2;
    }
    else {
      System.out.println("Shape is not supported");
    }
    return 0.0d;
  }
}
