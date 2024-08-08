package com.microservice.student.controller;

import com.microservice.student.entity.StudentEntity;
import com.microservice.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @PostMapping("/saveStudent")
    public void saveStudent(StudentEntity studentEntity) {

        studentService.saveStudent(studentEntity);
    }

    @GetMapping("/students")
    public List<StudentEntity> getAllStudents() {

        return studentService.getAllStudents();
    }
}
