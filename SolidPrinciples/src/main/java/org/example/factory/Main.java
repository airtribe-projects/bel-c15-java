package org.example.factory;

public class Main {
  public static void main(String[] args) {
    Worker worker = new Human();
    Worker robotWorker = new Robot();
    FactoryWork factoryWork = new FactoryWork();
    factoryWork.perform(worker);
    factoryWork.perform(robotWorker);
  }
}
