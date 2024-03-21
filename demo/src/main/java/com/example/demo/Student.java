package com.example.demo;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name ="STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    private String name;
    
    @ManyToMany(mappedBy="students")
    private List<Course> courses;

    public Student(String name){
        name = this.name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long studentId) {
        this.Id = studentId;
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
