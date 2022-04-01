package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService ser;
	
	@GetMapping("/getStudent")
	public List<StudentEntity> findallstudent() {
		
		return ser.FindAllData();
	}
	
	
	
	@GetMapping("/getStudentByAddress/{address}")
	public List<StudentEntity> findUserByAddress(@PathVariable String address) {
		return ser.getUserbyAddress(address);
	}
}
