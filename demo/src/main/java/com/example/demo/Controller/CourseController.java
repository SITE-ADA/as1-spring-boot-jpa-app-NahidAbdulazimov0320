package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Course;
import com.example.demo.Service.CourseService;

import java.util.*;

/**
 * Controller class for handling HTTP requests related to courses.
 * Exposes endpoints for CRUD operations on courses.
 */
@RestController
@RequestMapping("/courses")
public class CourseController {

    /**
     * Service for handling course-related business logic.
     */
    @Autowired
    private CourseService courseService;

    /**
     * Retrieves all courses.
     * @return List of courses.
     */
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    /**
     * Retrieves a course by its ID.
     * @param id The ID of the course to retrieve.
     * @return The course with the specified ID.
     */
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") Long id) {
        return courseService.getCourseById(id);
    }

    /**
     * Creates a new course.
     * @param course The course to create.
     * @return The newly created course.
     */
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    /**
     * Updates an existing course.
     * @param id The ID of the course to update.
     * @param course The updated course information.
     * @return The updated course.
     */
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable("id") Long id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    /**
     * Deletes a course by its ID.
     * @param id The ID of the course to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable("id") Long id) {
        courseService.deleteCourse(id);
    }
}