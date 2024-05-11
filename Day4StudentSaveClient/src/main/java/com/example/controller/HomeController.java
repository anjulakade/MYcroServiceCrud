package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;
import com.example.ServiceI.StudentServiceI;

@RestController
public class HomeController
{
	@Autowired
	StudentServiceI si;
	 
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student s)
	{
		 si.saveStudent(s);
		return " Student Data Save";
		
	}
	

}
