package com.odc.odcdevops.api;

import com.odc.odcdevops.entites.Student;
import com.odc.odcdevops.services.StudentServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentApi {

    public StudentServices studentServices;

    // C - Create
    @PostMapping
    public Student createStudent(@RequestBody Student st) {
        return studentServices.createStudent(st);
    }

    // R - Read
    @GetMapping
    public List<Student> findStudents() {
        return studentServices.findStudent();
    }

    // U - Update
    @PutMapping
    public Student updateStudent(@RequestBody Student st) {
        return studentServices.updateStudent(st);
    }

    // D - Delete
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentServices.deleteStudent(id);
    }
}