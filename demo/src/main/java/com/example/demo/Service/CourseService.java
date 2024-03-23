package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Course;
import com.example.demo.Repository.CourseRepository;

import java.util.*;

/**
 * Service class for managing courses.
 * Contains methods for performing CRUD operations on courses.
 */
@Service
public class CourseService {

    /** Repository for accessing course data. */
    @Autowired
    private CourseRepository courseRepository;

    /**
     * Retrieves all courses.
     * @return A list of all courses.
     */
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    /**
     * Retrieves a course by its ID.
     * @param courseId The ID of the course to retrieve.
     * @return The course with the specified ID, or null if not found.
     */
    public Course getCourseById(long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    /**
     * Creates a new course.
     * @param course The course to create.
     * @return The newly created course.
     */
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    /**
     * Updates an existing course.
     * @param courseId The ID of the course to update.
     * @param course The updated course information.
     * @return The updated course, or null if the course with the specified ID does not exist.
     */
    public Course updateCourse(Long courseId, Course course) {
        if (courseRepository.existsById(courseId)) {
            course.setCourseId(courseId);
            return courseRepository.save(course);
        }
        return null;
    }

    /**
     * Deletes a course by its ID.
     * @param courseId The ID of the course to delete.
     */
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }
}
