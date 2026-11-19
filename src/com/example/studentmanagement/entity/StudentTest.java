package com.example.studentmanagement.entity;

import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {

        // Creating a Student object
        Student s1 = new Student(
            101,
            "Rahul",
            "rahul@gmail.com",
            "BTech CSE",
            90,
            85,
            Arrays.asList("Java", "Python", "SQL")
        );

        // Display student details
        System.out.println("===== STUDENT DETAILS =====");

        System.out.println(s1);

        // Testing getter
        System.out.println("\n===== TESTING GETTER =====");
        System.out.println("Student Name: " + s1.getStudentName());

        // Testing setter
        System.out.println("\n===== TESTING SETTER =====");
        s1.setStudentName("Rahul Sharma");

        System.out.println("Updated Name: " + s1.getStudentName());

        // Testing average
        System.out.println("\n===== ACADEMIC PERFORMANCE =====");
        System.out.println("Average: " + s1.calculateAverage());

        // Testing performance category
        System.out.println("Category: " + s1.getPerformanceCategory());

        // Testing stronger subject
        System.out.println("Stronger Subject: " + s1.getStrongerSubject());

    }
}