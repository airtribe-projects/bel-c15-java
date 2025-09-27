package org.example;

import org.example.cohort.Cohort;
import org.example.course.Course;
import org.example.course.CourseLanguage;
import org.example.course.Offline;
import org.example.course.Online;
import org.example.learner.Java;
import org.example.learner.Learner;
import org.example.learner.Node;


public class Main {
  public static void main(String[] args)
  {
    Course nodeOfflineCourse = new Offline(1L, "Node.js Offline Course", "Learn Node.js in an offline setting", CourseLanguage.NODE, "Room 101");
    Course nodeOnlineCourse = new Online(2L, "Node.js Online Course", "Learn Node.js online", CourseLanguage.NODE, "https://zoom.us/123");
    Course javaOnlineCourse = new Online(3L, "Java Online Course", "Learn Java online", CourseLanguage.JAVA, "https://zoom.us/456");
    Course javaOfflineCourse = new Offline(4L, "Java Offline Course", "Learn Java in an offline setting", CourseLanguage.JAVA, "Room 102");

    Cohort c1 = new Cohort("Cohort 1",1L, "Cohort 1 Description", new java.util.Date(), new java.util.Date());
    Cohort c2 = new Cohort("Cohort 2",2L, "Cohort 2 Description", new java.util.Date(), new java.util.Date());
    Cohort c3 = new Cohort("Cohort 3",3L, "Cohort 3 Description", new java.util.Date(), new java.util.Date());
    Cohort c4 = new Cohort("Cohort 4",4L, "Cohort 4 Description", new java.util.Date(), new java.util.Date());

    javaOfflineCourse.addCohortToCourse(c1);
    nodeOfflineCourse.addCohortToCourse(c2);
    javaOnlineCourse.addCohortToCourse(c3);
    nodeOnlineCourse.addCohortToCourse(c4);

    Node nodeLearner = new Node("Test", "Test", 1L, true);
    Learner nodeLearner2 = new Node("Test2", "Test2", 2L, false);
    Learner javaLearner = new Java("Java", "Learner", 3L, true);
    Learner javaLearner2 = new Java("Java2", "Learner2", 4L, false);

    c1.addLearnersToCohort(nodeLearner);
    c1.addLearnersToCohort(javaLearner);

  }
}