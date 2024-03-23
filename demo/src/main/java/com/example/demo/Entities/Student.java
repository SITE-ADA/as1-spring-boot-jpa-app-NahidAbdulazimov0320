package com.example.demo.Entities;

import jakarta.persistence.*;
import java.util.*;

/**
 * Entity class representing a student.
 */
@Entity
@Table(name = "STUDENT")
public class Student {

    /** The ID of the student. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    /** The name of the student. */
    private String name;

    /** The age of the student. */
    private int age;

    /** The faculty of the student. */
    private String faculty;

    /** The list of courses in which the student is enrolled. */
    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    /**
     * Default constructor.
     */
    public Student() {

    }

    /**
     * Retrieves the age of the student.
     * @return The age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     * @param age The age of the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retrieves the faculty of the student.
     * @return The faculty of the student.
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Sets the faculty of the student.
     * @param faculty The faculty of the student.
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Constructor with name parameter.
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Retrieves the ID of the student.
     * @return The ID of the student.
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * Sets the ID of the student.
     * @param studentId The ID of the student.
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * Retrieves the name of the student.
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * @param name The name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for courses property are commented out for now

}
