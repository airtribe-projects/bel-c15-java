package org.example;

public class HumanWorker implements Workable, Eatable {

  @Override
  public void work() {
    System.out.println("Human is working");
  }

  @Override
  public void eat() {
    System.out.println("Human is eating");
  }
}
