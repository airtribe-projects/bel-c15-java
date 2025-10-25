package org.example.ocp;

import org.example.afterOCP.ShapeRhombus;


public class AreaCalculator {

  public double calculateArea(Object object) {
    if (object instanceof ShapeCircle) {
      ShapeCircle circle = (ShapeCircle) object;
      return Math.PI * circle.getRadius() * circle.getRadius();
    } else if (object instanceof ShapeRectangle) {
      ShapeRectangle rectangle = (ShapeRectangle) object;
      return rectangle.getLength() * rectangle.getWidth();
    } else if (object instanceof ShapeSquare) {
      ShapeSquare square = (ShapeSquare) object;
      return square.getSideLength() * square.getSideLength();
    } else {
      throw new IllegalArgumentException("Unknown shape type");
    }
  }
}
