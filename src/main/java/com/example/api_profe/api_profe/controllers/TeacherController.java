package com.example.api_profe.api_profe.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_profe.api_profe.models.TeacherModels;
import com.example.api_profe.api_profe.repositories.TeacherRespositories;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherRespositories teacherRepositories; 

    @GetMapping
    public List<TeacherModels> getAllTeachers(){
        return teacherRepositories.findAll();
    }


    @GetMapping("/{id}")
    public Optional<TeacherModels> getTeacherById(@PathVariable Long id) {
        Optional<TeacherModels> teacher = teacherRepositories.findById(id);
            return teacher;
    }

    @PostMapping
    public TeacherModels createTeacher(@RequestBody TeacherModels teacher) {
        return teacherRepositories.save(teacher);
    }

    
    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherRepositories.deleteById(id);
    }
}
