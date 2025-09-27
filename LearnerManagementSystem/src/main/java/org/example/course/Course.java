package org.example.course;

import java.util.ArrayList;
import java.util.List;
import org.example.cohort.Cohort;


public abstract class Course {
  private String courseName;

  private Long courseId;

  private String courseDescription;

  private CourseLanguage courseLanguage;

  // has-a
  private Cohort cohorts;

  public Course(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseDescription = courseDescription;
    this.courseLanguage = courseLanguage;
    this.cohorts = new ArrayList<>();
  }

  public Course(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, List<Cohort> cohorts) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseDescription = courseDescription;
    this.courseLanguage = courseLanguage;
    this.cohorts = cohorts;
  }

  public void addCohortToCourse(Cohort cohort) {
    this.cohorts.add(cohort);
  }


  public String getCourseName() {
    return courseName;
  }

  public Long getCourseId() {
    return courseId;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public CourseLanguage getCourseLanguage() {
    return courseLanguage;
  }

  public List<Cohort> getCohorts() {
    return cohorts;
  }

  public abstract void displayCourseDetails();
}


// course -> has many cohorts