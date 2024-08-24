package com.example.starter.service;

import java.util.List;

import com.example.starter.model.Student;

public interface StudentService {
	List<Student> getAllStudents(); 
	  
    Student getStudentById(Long id); 
  
    void saveStudent(Student student); 
  
    void deleteStudent(Long id); 

}
