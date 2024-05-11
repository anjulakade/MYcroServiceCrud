package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RepositoryI.StudentRepositoryI;
import com.example.ServiceI.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI 
{
 @Autowired
  StudentRepositoryI sr;
	@Override
	public void deletebyId(int id) {
		 sr.deleteById(id);
		
	}
	

}
