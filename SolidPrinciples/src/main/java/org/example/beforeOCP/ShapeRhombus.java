package org.example.beforeOCP;

public class ShapeRhombus {
  private String diagonal1;
  private String diagonal2;

  public ShapeRhombus(String diagonal1, String diagonal2) {
    this.diagonal1 = diagonal1;
    this.diagonal2 = diagonal2;
  }

  public String getDiagonal1() {
    return diagonal1;
  }

  public void setDiagonal1(String diagonal1) {
    this.diagonal1 = diagonal1;
  }

  public String getDiagonal2() {
    return diagonal2;
  }

  public void setDiagonal2(String diagonal2) {
    this.diagonal2 = diagonal2;
  }
}
