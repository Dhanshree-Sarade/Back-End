package com.jspiders.spring_mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.spring_mvc.pojo.StudentPOJO;
import com.jspiders.spring_mvc.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentPOJO addStudent(String name, String email, long contact, String address) {
		StudentPOJO pojo = repository.addStudent(name, email, contact, address);
		return pojo;
	}

	public StudentPOJO searchStudent(int id) {
		StudentPOJO pojo = repository.searchStudent(id);
		return pojo;
	}

	public List<StudentPOJO> findAllStudents() {
		List<StudentPOJO> students = repository.findAllStudents();
		return students;
	}

	public StudentPOJO removeStudent(int id) {
		StudentPOJO pojo = repository.removeStudent(id);
		return pojo;
	}


}
