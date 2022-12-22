package com.student.model;

import java.io.Serializable;

public class StudentModel implements Serializable {
	
	private int id;
	
	private String studentName;
	
	private String rollNo;
	
	private String course;
	
	private String mobileNo;
	
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(int id, String studentName, String rollNo, String course, String mobileNo, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.course = course;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	
}
