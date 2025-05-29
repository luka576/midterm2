package oop.mind2.t2;

import java.util.Arrays;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS(List<Student> students) {
        this.students = students;
    }

    public void printStudentData(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Courses enrolled: ");

        for (LearningCourse course : student.getLearningCourses()) {
            System.out.println("Course Title: " + course.getTitle());
            System.out.println("Acceptance Prerequisites: " + course.getAcceptancePrerequisites());
            System.out.println("Major Topics: " + course.getMajorTopics());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LearningCourse course1 = new LearningCourse("Object Oriented Programming", "CS50 Introduction to Programming", "Java syntax and data structures, Procedural programming, Classes, Polymorphism, Packages, ETC ");
        LearningCourse course2 = new LearningCourse("Computer Organization", "Representing and manipulating information, Machine-level representations of programs, Optimizing program performance, The memory hierarchy", "CS50 Introduction to Programming");
        LearningCourse course3 = new LearningCourse("English Language Course C1-1", "English for Academic Purposes, Reading skills, Speaking skills", "English Language Course C1-2");
        LearningCourse course4 = new LearningCourse("Mathematical Logic,Discrete Mathematics, Sets and Graph Theory, Combinatorics, Digital Systems", "Mathematical Foundation of Computing", "MATH 150 Calculus I, CS50 Introduction to Programming");
        LearningCourse course5 = new LearningCourse("Calculus II", "MATH150 Calculus I", "Antiderivatives, Definite integrals, Techniques and applications of integration, Improper integrals, Infinite series");

        Student student1 = new Student("Luka Manvelishvili", Arrays.asList(course1, course2, course3, course4, course5));

        UMS ums = new UMS(Arrays.asList(student1));
        ums.printStudentData(student1);
    }
}