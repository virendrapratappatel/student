package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.entity.Student;
import com.student.model.StudentModel;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentModel saveOrUpdate(StudentModel req) {
		try{
			Student student = new Student();
			if(req.getId()>0) {
				student = studentRepository.findById(req.getId());
			}
			student.setAddress(req.getAddress());
			student.setCourse(req.getCourse());
			student.setMobileNo(req.getMobileNo());
			student.setRollNo(req.getRollNo());
			student.setStudentName(req.getStudentName());
			Student student2 = studentRepository.save(student);
			req.setId(student2.getId());
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return req;
	}
	
	public List<StudentModel> getAllStudent() {
		List<StudentModel> list = new ArrayList<>();
		try
		{
			System.out.println("Call Database check");
			List<Student> students = this.studentRepository.findAll();
			for (Student student : students) {
				StudentModel studentModel = new StudentModel();
				studentModel.setId(student.getId());
				studentModel.setAddress(student.getAddress());
				studentModel.setCourse(student.getCourse());
				studentModel.setMobileNo(student.getMobileNo());
				studentModel.setRollNo(student.getRollNo());
				studentModel.setStudentName(student.getStudentName());
				list.add(studentModel);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}


	
	
	public StudentModel findById(int id) {
		StudentModel studentModel = null;
		try {
			System.out.println("Call Database check");
			Student student = this.studentRepository.findById(id);
			if(student!=null){
				studentModel = new StudentModel();
				studentModel.setId(student.getId());
				studentModel.setAddress(student.getAddress());
				studentModel.setCourse(student.getCourse());
				studentModel.setMobileNo(student.getMobileNo());
				studentModel.setRollNo(student.getRollNo());
				studentModel.setStudentName(student.getStudentName());
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

		return studentModel;
	}
	
	//@Transactional(readOnly = false)
	//@Modifying
	public StudentModel deleteById(int id) {
		StudentModel studentModel = new StudentModel();
		try {
			
			this.studentRepository.deleteById(id);
//			if(student!=null){
//				studentModel.setId(student.getId());
//				studentModel.setAddress(student.getAddress());
//				studentModel.setCourse(student.getCourse());
//				studentModel.setMobileNo(student.getMobileNo());
//				studentModel.setRollNo(student.getRollNo());
//				studentModel.setStudentName(student.getStudentName());
//			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

		return studentModel;
	}
	

}
