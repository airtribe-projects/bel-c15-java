package org.example.learner;

public class Java extends Learner {
  private Boolean doesKnowMultithreading;

  public Java(String learnerName, String learnerEmail, Long learnerId, Boolean doesKnowMultithreading) {
    super(learnerName, learnerEmail, learnerId);
    this.doesKnowMultithreading = doesKnowMultithreading;
  }

  @Override
  public void displayLearnerDetails() {
    System.out.println("Learner Id: " + getLearnerId());
    System.out.println("Learner Name: " + getLearnerName());
    System.out.println("Learner Email: " + getLearnerEmail());
    System.out.println("Does Know Multithreading: " + doesKnowMultithreading);
  }
}
