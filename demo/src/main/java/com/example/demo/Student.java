package com.example.demo;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long studentId;
    
    @ManyToMany(mappedBy="students")
    private List<Course> courses;

    
}
