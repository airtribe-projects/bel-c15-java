package org.example.beforeOCP;

public class Main {

  public static void main(String[] args) {
    ShapeSquare square = new ShapeSquare("5");
    AreaCalculator calculator = new AreaCalculator();
    calculator.calculateArea(square);
    Circle circle = new Circle("7");
    calculator.calculateArea(circle);
  }
}
