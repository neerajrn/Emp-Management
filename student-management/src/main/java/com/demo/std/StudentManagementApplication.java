package com.demo.std;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.std.entity.Student;
import com.demo.std.repository.Studentrepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private Studentrepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception { 
		
	
		
	}

}
