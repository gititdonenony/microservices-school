package com.microservices.school.service;


import com.microservices.school.entity.SchoolEntity;
import com.microservices.school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    @PostMapping("/save")
    public void saveSchool(@RequestBody SchoolEntity schoolEntity) {
        schoolRepository.save(schoolEntity);
    }

    @GetMapping("/getAllSchools")
    public List<SchoolEntity> getAllSchools() {

        return schoolRepository.findAll();
    }
}
