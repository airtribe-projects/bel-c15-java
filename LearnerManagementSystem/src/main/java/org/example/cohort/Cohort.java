package org.example.cohort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.example.instructor.Instructor;
import org.example.learner.Learner;
import org.example.learner.Node;


public class Cohort {
  private String cohortName;

  private Long cohortId;

  private String cohortDescription;

  private Date startDate;

  private Date endDate;

  // DIP, Loose coupling
  private List<Learner> learners;

  private List<Instructor> instructors;

  public Cohort(String cohortName, Long cohortId, String cohortDescription, Date startDate, Date endDate) {
    this.cohortName = cohortName;
    this.cohortId = cohortId;
    this.cohortDescription = cohortDescription;
    this.startDate = startDate;
    this.endDate = endDate;
    this.learners = new ArrayList<>();
    this.instructors = new ArrayList<>();
  }

  public Cohort(String cohortName, Long cohortId, String cohortDescription, Date startDate, Date endDate,
      List<Learner> learners, List<Instructor> instructors) {
    this(cohortName, cohortId, cohortDescription, startDate, endDate);
    this.learners = learners;
    this.instructors = instructors;
  }

  public void addLearnersToCohort(Learner learner) {
      learners.add(learner);
  }

  public void addInstructorsToCohort(Instructor instructor) {
      instructors.add(instructor);
  }

  public void removeLearnerFromCohort(Learner learner) {
      learners.remove(learner);
  }

  public void removeInstructorFromCohort(Instructor instructor) {
      instructors.remove(instructor);
  }

  public String getCohortName() {
    return cohortName;
  }

  public Long getCohortId() {
    return cohortId;
  }

  public String getCohortDescription() {
    return cohortDescription;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public List<Learner> getLearners() {
    return learners;
  }

  public List<Instructor> getInstructors() {
    return instructors;
  }

  public void displayCohortDetails() {
    System.out.println("Cohort Id: " + this.cohortId);
    System.out.println("Cohort Name: " + this.cohortName);
    System.out.println("Cohort Description: " + this.cohortDescription);
    System.out.println("Cohort Start Date: " + this.startDate);
    System.out.println("Cohort End Date: " + this.endDate);
    System.out.println("Cohort Learners: ");
    for (Learner learner : learners) {
      learner.displayLearnerDetails();
    }
    for (Instructor instructor : instructors) {
      instructor.displayInstructorDetails();
    }
  }
}
