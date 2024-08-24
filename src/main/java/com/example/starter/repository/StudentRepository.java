package com.example.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
