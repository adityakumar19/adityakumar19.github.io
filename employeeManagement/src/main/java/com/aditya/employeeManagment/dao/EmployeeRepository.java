package com.aditya.employeeManagment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.employeeManagment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByGenderAndJobLevel(String gender, Integer jobLevel);

	List<Employee> findByJobLevel(Integer jobLevel);

	List<Employee> findByGender(String gender);
	
}
