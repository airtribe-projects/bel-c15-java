package org.example;

import java.util.Scanner;


public class LearnerManagementSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] learnerNames = new String[100];
    int[] learnerAges = new int[100];
    int[] learnerXps = new int[100];

    int learnerCount = 0;
    double averageXp = 0.0;
    int userChoice = 0;

    do {
      System.out.println("1. Add Learner");
      System.out.println("2. List Learners");
      System.out.println("3. Calculate Average XP");
      System.out.println("4. Exit");

      System.out.println("Enter your choice:");
      userChoice = sc.nextInt();

      if (userChoice == 1) {
        if (learnerCount < learnerNames.length) {
          System.out.println("Enter the age of the learner:");
          int inputAge = sc.nextInt();
          if (inputAge < 18 || inputAge > 100) {
            System.out.println("Age should be greater than 18");
            continue;
          }
          learnerAges[learnerCount] = inputAge;

          System.out.println("Enter the name of the learner:");
          String inputName = sc.next();
          learnerNames[learnerCount] = inputName;

          System.out.println("Enter the XP of the learner:");
          int inputXp = sc.nextInt();
          learnerXps[learnerCount] = inputXp;


          learnerCount++;

        } else {
          System.out.println("No more space to add learners");
        }

      } else if (userChoice == 2) {
        if (learnerCount == 0) {
          System.out.println("No learners to display");
        } else {
          for (int i = 0; i < learnerCount; i++) {
            System.out.println("Name: " + learnerNames[i] + ", Age: " + learnerAges[i] + ", XP: " + learnerXps[i]);
          }
        }

      } else if (userChoice == 3) {
        int totalXp = 0;
        for (int i=0;i< learnerCount; i++) {
          totalXp += learnerXps[i];
        }
        averageXp = (double) totalXp / learnerCount;
        System.out.println("Average XP of learners: " + averageXp);

      } else {
        System.out.println("Exiting the system. Goodbye!");
      }

    } while (userChoice < 4);

  }
}
