package com.example.demo;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long student_id;

    private String name;

    private int age;

    private String faculty;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

   
    public Student(String name) {
        this.name = name;
    }

    public Long getStudentId() {
        return student_id;
    }

    public void setStudentId(Long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public List<Course> getCourses() {
    //     return courses;
    // }

    // public void setCourses(List<Course> courses) {
    //     this.courses = courses;
    // }

}
