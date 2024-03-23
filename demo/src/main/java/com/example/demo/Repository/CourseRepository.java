package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Course;

/**
 * Repository interface for managing courses.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}