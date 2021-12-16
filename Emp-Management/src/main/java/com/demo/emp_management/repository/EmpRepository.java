package com.demo.emp_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.emp_management.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
