package com.ibm.Jenkinsdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.Jenkinsdemo.model.Student;
import com.ibm.Jenkinsdemo.repo.StudentRepository;
import com.ibm.Jenkinsdemo.service.StudentService;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor

public class JenkinsDemoApplication {

	private StudentService studentService;
	
	@Autowired
	public JenkinsDemoApplication(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	
	@PostConstruct
	public void init()
	{
		
		
		
		studentService.createStudent(new Student("Srijita", "Garai", "hjhj@hj.com"));
		studentService.createStudent(new Student("Rahul", "George", "john@gmail.com"));
		studentService.createStudent(new Student("Halum", "hulum", "doee@hj.com"));
		
	}

}
