package com.student.model;

import java.util.List;

import com.student.entity.Student;

public class CustomerDetailsResponse {

	private int statuscode;
	private String message;
	private List<StudentModel> customerDetails;
	
	public List<StudentModel> getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(List<StudentModel> customerDetails) {
		this.customerDetails = customerDetails;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
