package org.example.instructor;

public class Instructor {
  private long instructorId;

  private String instructorName;

  private String instructorEmail;

  public Instructor(long instructorId, String instructorName, String instructorEmail) {
    this.instructorId = instructorId;
    this.instructorName = instructorName;
    this.instructorEmail = instructorEmail;
  }

  public long getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(long instructorId) {
    this.instructorId = instructorId;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getInstructorEmail() {
    return instructorEmail;
  }

  public void setInstructorEmail(String instructorEmail) {
    this.instructorEmail = instructorEmail;
  }

  public void displayInstructorDetails() {
    System.out.println("Instructor ID: " + instructorId);
    System.out.println("Instructor Name: " + instructorName);
    System.out.println("Instructor Email: " + instructorEmail);
  }
}
