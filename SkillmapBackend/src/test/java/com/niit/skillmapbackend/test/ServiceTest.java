package com.niit.skillmapbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmapbackend.config.HibernateConfig;
import com.niit.skillmapbackend.model.Employee;
import com.niit.skillmapbackend.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = HibernateConfig.class)
public class ServiceTest {
	
	@Autowired
	EmployeeService employeeservice;
	
	
	@Ignore
	@Test
	public void testInsertEmp() {

		//
		// empdao=new EmployeeDaoImpl();
		Employee emp = new Employee();
		// emp.setEmpID(1);
		emp.setEmpName("prat");
		emp.setPassword("12345");
		emp.setEmailId("prat@gmail.com");
		emp.setRole("employee");
		emp.setPhone("576357");
		emp.setStatus(true);

		assertEquals(true, employeeservice.insertEmp(emp));

	}

	@Ignore
	@Test
	public void testUpdateEmp() {
		 Employee emp= new Employee();
		emp.setEmpID(1);
		// emp.setEmpID(34);
		emp.setEmpName("pratibha");
		emp.setPassword("12345");
		emp.setEmailId("hghjfgejf");
		emp.setRole("hr");
		emp.setPhone("97867576567");
		emp.setStatus(true);

		assertEquals(true, employeeservice.updateEmp(emp));

	}
	@Ignore
	@Test
	public void testGetEmp() {
		assertEquals("pratik", employeeservice.getEmployee(3).getEmpName());
	}
	@Ignore
	@Test
	public void getAll() {
		assertEquals(2, employeeservice.getAllEmployees().size());
	}

	@Ignore
	@Test
	public void testDeleteEmp() {
		Employee emp= new Employee();
		emp.setEmpID(3);
		assertEquals(true, employeeservice.delete(emp));
	}

	@Ignore
	@Test
	public void testLoginEmp() {
		
		//Employee emp= new Employee();
		//emp.setEmailId("hghjfgejf");
		//emp.setPassword("12345");
		//emp.setRole("hr");
		boolean rs=false;
		if(employeeservice.loginEmployee("hghjfgejf", "12345", "hr")!=null)
			rs=true;
		assertEquals(true,rs);
		
	}
}
