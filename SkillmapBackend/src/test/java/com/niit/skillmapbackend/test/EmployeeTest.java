package com.niit.skillmapbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmapbackend.config.HibernateConfig;
import com.niit.skillmapbackend.dao.EmployeeDao;
import com.niit.skillmapbackend.model.Employee;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = HibernateConfig.class)

public class EmployeeTest {

	@Autowired
	private EmployeeDao empdao;
	//private Employee emp;

	@Ignore
	@Test
	public void testInsertEmp() {

		//
		// empdao=new EmployeeDaoImpl();
		Employee emp = new Employee();
		// emp.setEmpID(1);
		emp.setEmpName("pratik");
		emp.setPassword("12345");
		emp.setEmailId("dxhfgkhglhj");
		emp.setRole("employee");
		emp.setPhone("576357");
		emp.setStatus(true);

		assertEquals(true, empdao.insertEmp(emp));

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
		emp.setPhone("576357");
		emp.setStatus(true);

		assertEquals(true, empdao.updateEmp(emp));

	}

	@Ignore
	@Test
	public void testGetEmp() {
		assertEquals("pratik", empdao.getEmployee(3).getEmpName());
	}
	@Ignore
	@Test
	public void getAll() {
		assertEquals(2, empdao.getAllEmployees().size());
	}

	@Ignore
	@Test
	public void testDeleteEmp() {
		Employee emp= new Employee();
		emp.setEmpID(3);
		assertEquals(true, empdao.delete(emp));
	}

	
	@Test
	public void testLoginEmp() {
		
		//Employee emp= new Employee();
		//emp.setEmailId("hghjfgejf");
		//emp.setPassword("12345");
		//emp.setRole("hr");
		boolean rs=false;
		if(empdao.loginEmployee("hghjfgejf", "12345", "hr")!=null)
			rs=true;
		assertEquals(true,rs);
		
	}
}
