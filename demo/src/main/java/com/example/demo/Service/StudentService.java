package com.example.demo.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Student;
import com.example.demo.Repository.StudentRepository;

/**
 * Service class for managing students.
 * Contains methods for performing CRUD operations on students.
 */
@Service
public class StudentService {

    /** Repository for accessing student data. */
    @Autowired
    private StudentRepository studentRepository;

    /**
     * Retrieves all students.
     * @return A list of all students.
     */
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    /**
     * Retrieves a student by their ID.
     * @param id The ID of the student to retrieve.
     * @return The student with the specified ID, or null if not found.
     */
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new student.
     * @param student The student to create.
     * @return The newly created student.
     */
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * Updates an existing student.
     * @param id The ID of the student to update.
     * @param student The updated student information.
     * @return The updated student, or null if the student with the specified ID does not exist.
     */
    public Student updateStudent(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setStudentId(id);
            return studentRepository.save(student);
        }
        return null;
    }

    /**
     * Deletes a student by their ID.
     * @param id The ID of the student to delete.
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    /**
     * Retrieves students by their name.
     * @param name The name of the students to retrieve.
     * @return A list of students with the specified name.
     */
    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    // Custom query method commented out for now

    // public List<Student> findStudentsOlderThan(int age) {

    //     return studentRepository.findByAgeIsGreaterThanEqual(age);
    // }
}
