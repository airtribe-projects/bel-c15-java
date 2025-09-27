package org.example;

import java.util.ArrayList;
import java.util.List;


public class Human {
  // instance variables
  int age;

  String name;

  int numberOfLegs;

  static int count;

  // No Argument Constructor
  // Default constructor
  public Human() {
    this(0, "Unknown", 2);
  }

  public Human(Human human) {
    age = human.age;
    name = human.name;
    numberOfLegs = human.numberOfLegs;
  }

  // Three arg
  // Parameterized constructor
  // All argument
  public Human(int providedAge, String providedName, int providedNumberOfLogs) {
    age = providedAge;
    name = providedName;
    numberOfLegs = providedNumberOfLogs;
    count++;
  }

  public Human(int providedAge, String providedName) {
    this(providedAge, providedName, 2);
  }

  // instance method
  void sleep() {

    int i = 0;
    System.out.println(name + " is sleeping" + i);
  }

  List<Integer> sleep(int hours) {
    System.out.println(name + " is sleeping for " + hours + " hours");
    return new ArrayList<>();
  }

  void sleep(long hours) {
    System.out.println(name + " is sleeping for " + hours + " hours");
  }

//  void sleep(double hours) {
//    System.out.println(name + " is sleeping for " + hours + " hours");
//  }


  void incrementCount() {
    count++;
    System.out.println("Name is " + name);
    System.out.println("Count is: " + count);
  }

  void eat() {
    System.out.println(name + " is eating" + " with " + numberOfLegs + " legs");
  }
}
