package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private Integer studentId;
	
	@Column(name="studentname")
	private String studentName;
	
	@Column(name="studentmarks")
	private String studentMarks;
	
	@Column(name="studentaddress")
	private String studentAddress;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(Integer studentId, String studentName, String studentMarks, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks="
				+ studentMarks + ", studentAddress=" + studentAddress + "]";
	}
	
	
	
}
