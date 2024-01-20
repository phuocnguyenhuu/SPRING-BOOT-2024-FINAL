package com.phuocnguyenhuu.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phuocnguyenhuu.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// define endpoint for "/students" - return a list of students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Phuoc", "Nguyen1"));
		theStudents.add(new Student("Andy", "Nguyen2"));
		theStudents.add(new Student("Samson", "Nguyen3"));
		return theStudents;
	}

}
