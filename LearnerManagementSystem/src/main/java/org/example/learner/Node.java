package org.example.learner;

public class Node extends Learner {
  private Boolean doesKnowEventLoop;

  public Node(String learnerName, String learnerEmail, Long learnerId, Boolean doesKnowEventLoop) {
    super(learnerName, learnerEmail, learnerId);
    this.doesKnowEventLoop = doesKnowEventLoop;
  }

  @Override
  public void displayLearnerDetails() {
    System.out.println("Learner Id: " + getLearnerId());
    System.out.println("Learner Name: " + getLearnerName());
    System.out.println("Learner Email: " + getLearnerEmail());
    System.out.println("Does Know Event Loop: " + doesKnowEventLoop);
  }
}
