package com.demo.std.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.std.entity.Student;

public interface Studentrepository extends JpaRepository<Student, Long>
{

}
