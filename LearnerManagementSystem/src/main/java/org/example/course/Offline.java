package org.example.course;

import java.util.List;
import org.example.cohort.Cohort;


public class Offline extends Course {

  private String physicalLocation;

  public Offline(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String physicalLocation) {
    super(courseId, courseName, courseDescription, courseLanguage);
    this.physicalLocation = physicalLocation;
  }

  public Offline(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String physicalLocation, List<Cohort> cohorts) {
    super(courseId, courseName, courseDescription, courseLanguage, cohorts);
    this.physicalLocation = physicalLocation;
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Id: " + getCourseId());
    System.out.println("Course Name: " + getCourseName());
    System.out.println("Course Description: " + getCourseDescription());
    System.out.println("Course Language: " + getCourseLanguage().toString());
    System.out.println("Physical Location: " + this.physicalLocation);
    for (Cohort cohort : getCohorts()) {
      cohort.displayCohortDetails();
    }
  }
}
