package com.microservice.student.service;

import com.microservice.student.entity.StudentEntity;
import com.microservice.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
