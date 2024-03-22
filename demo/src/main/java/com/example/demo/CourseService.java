package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(long course_id) {
        return courseRepository.findById(course_id).orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long course_id, Course course){
        if (courseRepository.existsById(course_id)) {
            course.setCourseId(course_id);
            return courseRepository.save(course);
        }
        return null;
    }

    public void deleteCourse(Long course_id){
        courseRepository.deleteById(course_id);
    }

}
