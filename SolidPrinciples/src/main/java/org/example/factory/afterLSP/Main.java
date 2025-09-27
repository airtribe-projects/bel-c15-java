package org.example.factory.afterLSP;

public class Main {
  public static void main(String[] args) {
    Workable human = new Human();
    Workable robot = new Robot();
    FactoryWork factoryWork = new FactoryWork();
    factoryWork.perform(human);
    factoryWork.perform(robot);
  }
}

