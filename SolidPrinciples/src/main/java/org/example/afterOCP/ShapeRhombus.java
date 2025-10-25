package org.example.afterOCP;

public class ShapeRhombus implements Shape {
    private double diagonal1;

    private double diagonal2;

    public ShapeRhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }


    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

  @Override
  public double calculateArea() {
    return diagonal1 * diagonal2;
  }
}
