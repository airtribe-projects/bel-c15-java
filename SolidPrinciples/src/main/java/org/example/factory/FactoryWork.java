package org.example.factory;

public class FactoryWork {
  public void perform(Worker worker) {
    System.out.println("Worker is eating");
    worker.eat();
    worker.work();
  }
}
