package com.microservices.school.controller;

import com.microservices.school.entity.SchoolEntity;
import com.microservices.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
@RequiredArgsConstructor
public class SchoolController {
    @Autowired
    private final SchoolService schoolService;

    @PostMapping("/saveSchool")
    public void saveSchool(@RequestBody SchoolEntity schoolEntity) {
        schoolService.saveSchool(schoolEntity);
    }

    @GetMapping("/schools")
    public List<SchoolEntity> getAllSchools() {
        return schoolService.getAllSchools();
    }

}