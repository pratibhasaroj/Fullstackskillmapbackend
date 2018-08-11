package com.niit.skillmapbackend.dao;

import java.util.List;



import com.niit.skillmapbackend.model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public boolean delete(Employee emp);
	public boolean insertEmp(Employee emp);
	public boolean updateEmp(Employee emp);
	public boolean setStatusEmp(Employee emp);
	public Employee loginEmployee(String emailId,String password,String role);
	
}
