package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceI.StudentServiceI;

@RestController
public class HomeController 
{
	@Autowired
	StudentServiceI si;
	@DeleteMapping("/DeletebyId/{id}")
	public String DeletedByid(@PathVariable int id)
	{
		 si.deletebyId(id);
		return "Data Deleted";
		
		
		
	}

}
