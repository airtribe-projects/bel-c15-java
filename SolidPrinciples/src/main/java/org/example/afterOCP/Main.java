package org.example.afterOCP;


public class Main {

  public static void main(String[] args) {
      AreaCalculator areaCalculator = new AreaCalculator();

      Shape square = new ShapeSquare(4);
      Shape rhombus = new ShapeRhombus(5, 3);
      Shape point = new ShapePoint();
      areaCalculator.calculateArea(point);

  }
}
