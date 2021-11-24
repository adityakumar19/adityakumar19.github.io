package com.aditya.employeeManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.employeeManagment.dto.EmployeeUpdateDTO;
import com.aditya.employeeManagment.entity.Employee;
import com.aditya.employeeManagment.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/api/employee")
	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = employeeService.getAllEmployees();
		return employeeList;
	}

	@GetMapping("/api/employeeById")
	public Employee getEmployeeById(@RequestParam(name = "id", required = true) Integer id) throws Exception {

		Employee employee = employeeService.getEmployeeById(id);
		return employee;
	}

	@GetMapping("/api/employeeByFilter")
	public List<Employee> getEmployeeByFilter(@RequestParam(name = "gender", required = false) String gender,
			@RequestParam(name = "jobLevel", required = false) Integer jobLevel) throws Exception {

		List<Employee> employeeList = employeeService.getEmployeeByFilter(gender, jobLevel);
		return employeeList;
	}

	@PostMapping("/api/employee")
	public String addNewEmployee(@RequestBody List<Employee> employeeList) {

		int count = employeeService.addNewEmployee(employeeList);
		return (count + " employee(s) added succesfully");
	}

	@PutMapping("/api/employee")
	public String updateEmployeeDetails(@RequestBody List<EmployeeUpdateDTO> employeeUpdateDTOList) {

		int count = employeeService.updateEmployeeDetails(employeeUpdateDTOList);
		return (count + " employee details updated succesfully");
	}

	@DeleteMapping("/api/employee")
	public String deleteEmployee(@RequestBody List<Integer> empIdList) {

		String message = employeeService.deleteEmployee(empIdList);
		return message;
	}
}
