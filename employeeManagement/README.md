# MySQL Database Scripts
CREATE TABLE employee (
  ID int NOT NULL AUTO_INCREMENT,
  Emp_Name varchar(50) NOT NULL,
  Age int,
  Gender char(1) NOT NULL,
  Salary int NOT NULL,
  JobLevel int NOT NULL,
  Address varchar(200),
  PRIMARY KEY (ID)
)

INSERT INTO employee 
VALUES (null,"Aniruddh Kumar",25,'M',90000,3,"Aurangabad");

# API Links
1) localhost:8080/api/employee - (GET)API to get all employees.
2) localhost:8080/api/employeeById - (GET)API to get employees by ID.
3) localhost:8080/api/employeeByFilter - (GET)API to get employees by filter i.e. either by gender or by job_level or both.
4) localhost:8080/api/employee - (POST)API to add new employee.
5) localhost:8080/api/employee - (PUT)API to update employee details(job_level and salary).
6) localhost:8080/api/employee - (DELETE)API to delete employees.
