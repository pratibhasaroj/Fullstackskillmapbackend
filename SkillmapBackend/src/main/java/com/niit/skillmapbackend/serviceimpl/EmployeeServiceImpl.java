package com.niit.skillmapbackend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.skillmapbackend.dao.EmployeeDao;
import com.niit.skillmapbackend.model.Employee;
import com.niit.skillmapbackend.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao empdao;

	public List<Employee> getAllEmployees() {
		
		return empdao.getAllEmployees();
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return empdao.getEmployee(id);
	}

	public boolean delete(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.delete(emp);
	}

	public boolean insertEmp(Employee emp) {
		
		return empdao.insertEmp(emp);
	}

	public boolean updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.updateEmp(emp);
	}

	public Employee loginEmployee(String emailId, String password, String role) {
		// TODO Auto-generated method stub
		return empdao.loginEmployee(emailId, password, role);
	}

	public boolean setStatusEmp(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.updateEmp(emp);
	}

}
