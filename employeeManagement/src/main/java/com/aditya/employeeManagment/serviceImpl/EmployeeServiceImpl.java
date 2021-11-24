package com.aditya.employeeManagment.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.employeeManagment.applicationPoperties.ApplicationConstants;
import com.aditya.employeeManagment.dao.EmployeeRepository;
import com.aditya.employeeManagment.dto.EmployeeUpdateDTO;
import com.aditya.employeeManagment.entity.Employee;
import com.aditya.employeeManagment.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) throws Exception {
		Employee employee = employeeRepository.findById(id).orElse(null);
		if(null!=employee) {
			return employee;
		}
		else {
			throw new Exception("User not found for employee id: "+ id);
		}
	}

	@Override
	public List<Employee> getEmployeeByFilter(String gender, Integer jobLevel) throws Exception {
		
		List<Employee> employeeList= new ArrayList<>();
		
		if(null!=gender && null!=jobLevel) {
			employeeList = employeeRepository.findByGenderAndJobLevel(gender,jobLevel);
		} else if(null==gender && null!=jobLevel) {
			employeeList = employeeRepository.findByJobLevel(jobLevel);
		} else if(null!=gender && null==jobLevel) {
			employeeList = employeeRepository.findByGender(gender);
		} 
		else {
			throw new Exception("Apply atleast one filter (gender or job-level)");
		}
		
		return employeeList;
	}

	@Override
	public int addNewEmployee(List<Employee> employeeList) {
		
		for (Employee employee : employeeList) {
			if((employee.getAge()<ApplicationConstants.EMPLOYEE_MIN_AGE || employee.getAge()>ApplicationConstants.EMPLOYEE_MAX_AGE) ||
					(!employee.getGender().equalsIgnoreCase(ApplicationConstants.EMPLOYEE_GENDER_MALE) && 
							!employee.getGender().equalsIgnoreCase(ApplicationConstants.EMPLOYEE_GENDER_FEMALE)) ||
					(employee.getJobLevel()<ApplicationConstants.EMPLOYEE_MIN_JOB_LEVEL || employee.getJobLevel()>ApplicationConstants.EMPLOYEE_MAX_JOB_LEVEL))
			{
							
				throw new RuntimeException("INVALID DATA ENTRY. Input should satisfy following conditions: "
											+ "1) Employee age should be in range 21 to 58  " 
											+ "2) Employee gender should be M or F  "
											+ "3) Job level should be between 1 and 5");
			}
		}
		
		List <Employee> savedEmployees = employeeRepository.saveAllAndFlush(employeeList);
		return savedEmployees.size();
	}

	@Override
	public int updateEmployeeDetails(List<EmployeeUpdateDTO> employeeUpdateDTOList) {
		
		List<Integer> idList = new ArrayList<>();
		List<Employee> empList = new ArrayList<>();
				
		for (EmployeeUpdateDTO employeeUpdateDTO : employeeUpdateDTOList) {
			idList.add(employeeUpdateDTO.getId());
		}
		
		empList = employeeRepository.findAllById(idList);
		
		for (Employee employee : empList) {
			for (EmployeeUpdateDTO employeeUpdateDTO : employeeUpdateDTOList) {
				if(employee.getEmployeeId() ==  employeeUpdateDTO.getId()) {
					employee.setJobLevel(employeeUpdateDTO.getJobLevel());
					employee.setSalary(employeeUpdateDTO.getSalary());
				}
			}
		}
		
		List<Employee> savedEntityList = employeeRepository.saveAllAndFlush(empList);
		return savedEntityList.size();
	}

	@Override
	public String deleteEmployee(List<Integer> empIdList) {
		
		employeeRepository.deleteAllById(empIdList);
		return "All passed id(s) have been deleted succesfully.";
	}

}
