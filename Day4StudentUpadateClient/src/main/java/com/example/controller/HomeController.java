package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;
import com.example.ServiceI.StudentServiceI;

@RestController
public class HomeController 
{
	@Autowired
	StudentServiceI si;
	 @PutMapping("/updatedata/{id}")
	 public  String  updateByid(@PathVariable int id,@RequestBody Student s)
	
	 {
		 si.updateByid(id,s);
		 return " student data updated ";
	 }

}
