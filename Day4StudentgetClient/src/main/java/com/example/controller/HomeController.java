package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Model.Student;
import com.example.ServiceI.StudentServiceI;

@RestController
public class HomeController
{
	@Autowired
	 StudentServiceI si;
@GetMapping("/getAllStudents")
public Iterable<Student> getAllStudents()
{
	return si.getAllStudents();
	 

}
	

}
