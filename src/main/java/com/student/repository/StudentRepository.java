package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends BaseRepository<Student, Integer> {

	@Query(value = "select * from student order by id desc",nativeQuery = true)
	List<Student> findStudent();

	Student findById(int id);

/*	@Query(value = "select * from customer_details where id = (select min(id) from customer_details where id > ?1)",nativeQuery = true)
	Student findByNextPreviousValue(int id);
	
	@Query(value = "select  * from customer_details where salary in (select distinct top 5 salary from employee order by salary desc)",nativeQuery = true)
	List<Student> findLatastCustomeDetails();
	
*/
	
}
