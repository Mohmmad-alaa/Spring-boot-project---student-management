package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		repo.deleteById(id);
	}

}
