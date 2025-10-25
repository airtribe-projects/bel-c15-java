package org.example.ocp;

public class Main {

  public static void main(String[] args) {
      AreaCalculator areaCalculator = new AreaCalculator();

      ShapeSquare square = new ShapeSquare(4);
      areaCalculator.calculateArea(square);

  }
}
