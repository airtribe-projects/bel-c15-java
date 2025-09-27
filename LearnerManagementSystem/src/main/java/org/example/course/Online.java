package org.example.course;

import java.util.List;
import org.example.cohort.Cohort;


public class Online extends Course {
  private String zoomUrl;

  public Online(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String zoomUrl) {
    super(courseId, courseName, courseDescription, courseLanguage);
    this.zoomUrl = zoomUrl;
  }

  public Online(Long courseId, String courseName, String courseDescription, CourseLanguage courseLanguage, String zoomUrl, List<Cohort> cohorts) {
    super(courseId, courseName, courseDescription, courseLanguage, cohorts);
    this.zoomUrl = zoomUrl;
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Id: " + getCourseId());
    System.out.println("Course Name: " + getCourseName());
    System.out.println("Course Description: " + getCourseDescription());
    System.out.println("Course Language: " + getCourseLanguage().toString());
    System.out.println("ZoomUrl: " + this.zoomUrl);
    for (Cohort cohort : getCohorts()) {
      cohort.displayCohortDetails();
    }
  }
}
