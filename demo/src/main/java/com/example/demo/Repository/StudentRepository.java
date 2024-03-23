package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Student;

/**
 * Repository interface for managing students.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    /**
     * Finds students by their name.
     * @param name The name of the students to find.
     * @return A list of students with the specified name.
     */
    List<Student> findByName(String name);

    
      // @Query("SELECT s FROM Student s WHERE s.age > :age")
    // List<Student> findStudentsOlderThan(@Param("age") int age);


  // @Query("SELECT e FROM STUDENT e WHERE e.age = :someValue")
    // List<Student> findByAgeIsGreaterThanEqual(@Param("someValue") int someValue);

}
