package com.example.RepositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Student;

@Repository
public interface StudentRepositoryI extends CrudRepository<Student,Integer> {

}
