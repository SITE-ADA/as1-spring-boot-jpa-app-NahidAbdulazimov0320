package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Student;
import com.example.demo.Service.StudentService;

import java.util.List;

/**
 * Controller class for handling HTTP requests related to students.
 * Exposes endpoints for CRUD operations on students.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    /**
     * Service for handling student-related business logic.
     */
    @Autowired
    private StudentService studentService;

    /**
     * Retrieves all students.
     * @return List of students.
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * Retrieves a student by their ID.
     * @param id The ID of the student to retrieve.
     * @return The student with the specified ID.
     */
    @GetMapping("/{student_id}")
    public Student getStudentById(@PathVariable("student_id") Long id) {
        return studentService.getStudentById(id);
    }
    
    /**
     * Retrieves students by their name.
     * @param name The name of the students to retrieve.
     * @return List of students with the specified name.
     */
    @GetMapping("/name/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String name) {
        return studentService.getStudentByName(name);
    }

    /**
     * Creates a new student.
     * @param student The student to create.
     * @return The newly created student.
     */
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    /**
     * Updates an existing student.
     * @param id The ID of the student to update.
     * @param student The updated student information.
     * @return The updated student.
     */
    @PutMapping("/{student_id}")
    public Student updateStudent(@PathVariable("student_id") Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    /**
     * Deletes a student by their ID.
     * @param id The ID of the student to delete.
     */
    @DeleteMapping("/{student_id}")
    public void deleteStudent(@PathVariable("student_id") Long id) {
        studentService.deleteStudent(id);
    }

    //  @GetMapping("/olderThan/{age}")
    //  public List<Student> findStudentsOlderThan(@PathVariable("age") int age) {
    //      return studentService.findStudentsOlderThan(age);
    //  }
}
