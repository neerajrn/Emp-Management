package com.demo.std.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.std.entity.Student;
import com.demo.std.repository.Studentrepository;
import com.demo.std.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	private Studentrepository studentrepository;

	public Studentserviceimpl(Studentrepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> getstudents() {

		return studentrepository.findAll();
	}

	@Override
	public Student savestudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public Student getstudentbyid(Long id) {
		
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updatestudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public void deletestudentbyid(Long id) {
		studentrepository.deleteById(id);
		
	}

}
