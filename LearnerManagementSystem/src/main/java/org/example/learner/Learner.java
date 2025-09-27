package org.example.learner;

public abstract class Learner {
  private String learnerName;

  private String learnerEmail;

  private Long learnerId;

  public Learner(String learnerName, String learnerEmail, Long learnerId) {
    this.learnerName = learnerName;
    this.learnerEmail = learnerEmail;
    this.learnerId = learnerId;
  }

  public String getLearnerName() {
    return learnerName;
  }

  public void setLearnerName(String learnerName) {
    this.learnerName = learnerName;
  }

  public String getLearnerEmail() {
    return learnerEmail;
  }

  public void setLearnerEmail(String learnerEmail) {
    this.learnerEmail = learnerEmail;
  }

  public Long getLearnerId() {
    return learnerId;
  }

  public void setLearnerId(Long learnerId) {
    this.learnerId = learnerId;
  }

  public abstract void displayLearnerDetails();
}
