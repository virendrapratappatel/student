package com.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentModel;
import com.student.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	StudentModel studentModel = new StudentModel();
	
	@PostMapping("/addStudent")
	//@CacheEvict(value = "student", allEntries = true)
	public StudentModel save(@RequestBody StudentModel req) {
		return this.studentService.saveOrUpdate(req);
	}
	
	
	@GetMapping
		//@Cacheable("student")
	public List<StudentModel> getAllStudentDetails() {
		//return this.studentService.getAllStudent();
		return null;
	}

	@GetMapping("getById")
	//@Cacheable(key = "#id", value = "student")
	public StudentModel getStudentById(@RequestHeader("id") int id) {
		return this.studentService.findById(id);
	}
	
	
	@DeleteMapping
	//@CacheEvict(key = "#id", value = "student")
	public StudentModel deleteById(@RequestHeader("id") int id) {
		return this.studentService.deleteById(id);
	}


}
