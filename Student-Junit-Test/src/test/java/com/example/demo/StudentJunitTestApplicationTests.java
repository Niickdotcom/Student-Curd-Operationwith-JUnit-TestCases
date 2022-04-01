package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = StudentJunitTestApplication.class)
@SpringBootTest
class StudentJunitTestApplicationTests {
	
	
	@Autowired
	private StudentService Service;


	@MockBean
	private StudentRepo repos;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void findall() {
		List<StudentEntity> user = (List<StudentEntity>) repos.findAll();
		assertThat(user).hasSizeGreaterThan(0);
	}
	
	@Test
	public void getUsersTest() {
		when(repos.findAll()).thenReturn(Stream
				.of(new StudentEntity(1, "Nishith", "70", "Nsp"), new StudentEntity(2, "Ravi", "80", "Bhy")).collect(Collectors.toList()));
		assertEquals(2, Service.getStudent().size());
	}
	
	@Test
	public void getStudentbyAddressTest() {
		String studentaddress = "Nsp";
		when(repos.findByAddress(studentaddress)).thenReturn(Stream.of(new StudentEntity(1,"Nishith","70","Nsp")).collect(Collectors.toList()));
		assertEquals(1, Service.getUserbyAddress(studentaddress).size());
	}
	

}
