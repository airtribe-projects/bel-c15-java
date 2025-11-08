package org.airtribe.LearnerManagementSystemC15.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;


@Entity
public class Learner {
  private String learnerName;

  private String learnerEmail;

  @ManyToMany
  private List<Cohort> cohorts;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long learnerId;

  public Learner(String learnerName, String learnerEmail) {
    this.learnerName = learnerName;
    this.learnerEmail = learnerEmail;
  }

  public Learner(String learnerName, String learnerEmail, Long learnerId) {
    this.learnerName = learnerName;
    this.learnerEmail = learnerEmail;
    this.learnerId = learnerId;
  }

  public Learner() {

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
}
