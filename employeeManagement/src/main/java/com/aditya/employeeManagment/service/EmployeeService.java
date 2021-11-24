package com.aditya.employeeManagment.service;

import java.util.List;

import com.aditya.employeeManagment.dto.EmployeeUpdateDTO;
import com.aditya.employeeManagment.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Integer id) throws Exception;

	List<Employee> getEmployeeByFilter(String gender, Integer jobLevel) throws Exception;

	int addNewEmployee(List<Employee> employeeList);

	int updateEmployeeDetails(List<EmployeeUpdateDTO> employeeUpdateDTOList);

	String deleteEmployee(List<Integer> empIdList);

}
