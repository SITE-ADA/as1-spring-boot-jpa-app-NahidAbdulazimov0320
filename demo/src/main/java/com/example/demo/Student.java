package com.example.demo;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;

    private String faculty;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

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

    public Student() {

    }

    public Student(String name) {
        name = this.name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long studentId) {
        this.id = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
