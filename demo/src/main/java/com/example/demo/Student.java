package com.example.demo;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name ="STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long studentId;

    private String name;
    
    @ManyToMany(mappedBy="students")
    private List<Course> courses;

    public Student(String name){
        name = this.name;
    }

    
}
