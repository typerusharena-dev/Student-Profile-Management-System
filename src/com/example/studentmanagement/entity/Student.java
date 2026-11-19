package com.example.studentmanagement.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Student {

    // 1. Attributes (Encapsulation)
    private int studentId;
    private String studentName;
    private String email;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private List<String> technicalSkills = new ArrayList<>();


    // 2. Default Constructor
    public Student() {
    }
    // 3. Parameterized Constructor
    public Student(int studentId, String studentName,
                   String email, String courseName,
                   double programmingScore,
                   double mathematicsScore,
                   List<String> technicalSkills) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;

        if (technicalSkills != null) {
            this.technicalSkills = new ArrayList<>(technicalSkills);
        }
    }
    // 4. Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public void setProgrammingScore(double programmingScore) {
        if (programmingScore >= 0 && programmingScore <= 100) {
            this.programmingScore = programmingScore;
        } else {
            throw new IllegalArgumentException(
                "Programming score must be between 0 and 100"
            );
        }
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public void setMathematicsScore(double mathematicsScore) {
        if (mathematicsScore >= 0 && mathematicsScore <= 100) {
            this.mathematicsScore = mathematicsScore;
        } else {
            throw new IllegalArgumentException(
                "Mathematics score must be between 0 and 100"
            );
        }
    }

    public List<String> getTechnicalSkills() {
        return new ArrayList<>(technicalSkills);
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        if (technicalSkills != null) {
            this.technicalSkills = new ArrayList<>(technicalSkills);
        }
    }


    // 5. Calculate Average Score
    public double calculateAverage() {
        return (programmingScore + mathematicsScore) / 2.0;
    }


    // 6. Performance Category
    public String getPerformanceCategory() {

        double average = calculateAverage();

        if (average >= 85) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else if (average >= 50) {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }


    // 7. Identify Stronger Subject
    public String getStrongerSubject() {

        if (programmingScore > mathematicsScore) {
            return "Programming";
        } else if (mathematicsScore > programmingScore) {
            return "Mathematics";
        } else {
            return "Both are Equal";
        }
    }

    // 8. toString() Method
    @Override
    public String toString() {

        return "Student ID: " + studentId +
               "\nStudent Name: " + studentName +
               "\nEmail: " + email +
               "\nCourse: " + courseName +
               "\nProgramming Score: " + programmingScore +
               "\nMathematics Score: " + mathematicsScore +
               "\nTechnical Skills: " + technicalSkills +
               "\nAverage Score: " + calculateAverage() +
               "\nPerformance: " + getPerformanceCategory() +
               "\nStronger Subject: " + getStrongerSubject();
    }


    // 9. equals() Method
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;

        return studentId == student.studentId;
    }


    // 10. hashCode() Method
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

}