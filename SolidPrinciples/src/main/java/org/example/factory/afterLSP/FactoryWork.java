package org.example.factory.afterLSP;

public class FactoryWork {
  public void perform(Workable worker) {
    System.out.println("Worker is working");
    worker.work();
  }
}
