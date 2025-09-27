package org.example;

public class IllegalByteCode {
  public static void main(String[] args) {
    Object obj = new Object();
    String str = (String) obj;
  }
}
