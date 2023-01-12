package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	Student updateStudent(Student student);
    void deleteStudent(long id);
	List<Student> getAllStudents();
    
    

}
