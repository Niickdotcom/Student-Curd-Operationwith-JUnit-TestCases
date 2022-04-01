package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;


@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
	List<StudentEntity> findByAddress(String address);
}
