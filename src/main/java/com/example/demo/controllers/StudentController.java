package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable long id) {
		service.deleteStudent(id);
	}

}
