package com.example.api_profe.api_profe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeacherModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_teacher;

    private String dni;
    private String lastname;
    private String name;
    private String subject;
    
    public TeacherModels() {
    }

    public TeacherModels(Long id_teacher, String dni, String lastname, String name, String subject) {
        this.id_teacher = id_teacher;
        this.dni = dni;
        this.lastname = lastname;
        this.name = name;
        this.subject = subject;
    }

    public Long getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(Long id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TeacherModels [id_teacher=" + id_teacher + ", dni=" + dni + ", lastname=" + lastname + ", name=" + name
                + ", subject=" + subject + "]";
    }    
    
}
