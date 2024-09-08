package com.example.api_profe.api_profe.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_profe.api_profe.models.TeacherModels;

public interface TeacherRespositories  extends JpaRepository<TeacherModels, Long> {

    void deleteById(Long id);

    
} 

