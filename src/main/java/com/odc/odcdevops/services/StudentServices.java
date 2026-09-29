package com.odc.odcdevops.services;

import com.odc.odcdevops.entites.Student;
import com.odc.odcdevops.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    public StudentRepository sRepository;

    // C - Create
    public Student createStudent(Student st) {
        return sRepository.save(st);
    }

    // R - Read
    public List<Student> findStudent() {
        return sRepository.findAll();
    }

    // U - Update
    public Student updateStudent(Student st) {
        return sRepository.save(st);
    }

    // D - Delete
    public void deleteStudent(Long id) {
        sRepository.deleteById(id);
    }
}