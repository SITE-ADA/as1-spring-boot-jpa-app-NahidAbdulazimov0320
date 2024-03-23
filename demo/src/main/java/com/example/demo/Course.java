package com.example.demo;

import java.util.*;

import jakarta.persistence.*;


@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    private Long course_id;    

    private String course_name;

    private String professor;

    @ManyToMany
    @JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "course_id"), 
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    public Course(){
        
    }
 

    public long getCourseId() {
        return course_id;
    }

    public void setCourseId(Long courseId) {
        this.course_id = courseId;
    }

  

    public String getCourseName() {
        return course_name;
    }

    public void setCourseName(String courseName) {
        this.course_name = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    // public List<Student> getStudents() {
    //     return students;
    // }

    // public void setStudents(List<Student> students) {
    //     this.students = students;
    // }


}
