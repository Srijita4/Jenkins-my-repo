package com.ibm.Jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.service.StudentService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/students")
public class StudentController {

	
	private  StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping
	public Student createStudent(Student student) {
		//TODO: process POST request
		
		return studentService.createStudent(student);
	}
	
	
}
