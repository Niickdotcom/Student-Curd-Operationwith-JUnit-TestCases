package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	
	public List<StudentEntity> FindAllData() {
		return repo.findAll();
	}


	public List<StudentEntity> getStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public List<StudentEntity> getUserbyAddress(String address) {
		return repo.findByAddress(address);
	}
}
