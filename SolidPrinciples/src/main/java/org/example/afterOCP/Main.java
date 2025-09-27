package org.example.afterOCP;

public class Main {
  public static void main(String[] args) {
    Shape square = new ShapeSquare("5");
    Shape circle = new ShapeCircle("7");
    Shape rhombus = new ShapeRhombus("6", "8");
    Shape point = new ShapePoint();

    AreaCalculator areaCalculator = new AreaCalculator();
    areaCalculator.calculateArea(square);
    areaCalculator.calculateArea(circle);
    areaCalculator.calculateArea(rhombus);
    areaCalculator.calculateArea(point);
  }
}

// OCP
// Programming to aN INTERFACE
// ABSTRACTION
// POLYMORPHISM