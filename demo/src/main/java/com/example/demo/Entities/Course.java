package com.example.demo.Entities;

import java.util.*;

import jakarta.persistence.*;


/**
 * Entity class representing a course.
 */
@Entity
@Table(name = "COURSE")
public class Course {

    /** The ID of the course. */
    @Id
    private Long courseId;    

    /** The name of the course. */
    private String courseName;

    /** The professor teaching the course. */
    private String professor;

    /** The list of students enrolled in the course. */
    @ManyToMany
    @JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "course_id"), 
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    /**
     * Default constructor.
     */
    public Course(){
        
    }

    /**
     * Retrieves the ID of the course.
     * @return The ID of the course.
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * Sets the ID of the course.
     * @param courseId The ID of the course.
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * Retrieves the name of the course.
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the name of the course.
     * @param courseName The name of the course.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Retrieves the professor teaching the course.
     * @return The professor teaching the course.
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * Sets the professor teaching the course.
     * @param professor The professor teaching the course.
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    // Getters and setters for students property are commented out for now

}
