package com.niit.skillmapbackend.daoimpl;

import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.skillmapbackend.dao.EmployeeDao;
import com.niit.skillmapbackend.model.Employee;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> getAllEmployees() {
		
		List<Employee> list=sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
		return list;
		
		
		
		
		
	}

	public Employee getEmployee(int id) {
		
		
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public boolean delete(Employee emp) {
		try {
			sessionFactory.getCurrentSession().delete(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean insertEmp(Employee emp) {
		
		try {
			sessionFactory.getCurrentSession().save(emp);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
		
		
	}
		
	public boolean updateEmp(Employee emp) {
		try {
			sessionFactory.getCurrentSession().update(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Employee loginEmployee(String emailId, String password, String role) {
		try
		{
			
Employee emp=(Employee) sessionFactory.getCurrentSession().createQuery("from Employee where emailId='"+emailId+"'and password='"+password+"' and role='"+role+"'" ).list().get(0);
return emp;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

	public boolean setStatusEmp(Employee emp) {
		try {
			sessionFactory.getCurrentSession().update(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
