package com.demo.std.service;

import java.util.List;

import com.demo.std.entity.Student;

public interface Studentservice
{
	List<Student> getstudents();
	
	Student savestudent(Student student);
	
	Student getstudentbyid(Long id);
	
	Student updatestudent(Student student);
	
	void deletestudentbyid(Long id);

}
