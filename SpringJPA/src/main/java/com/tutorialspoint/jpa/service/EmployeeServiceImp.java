package com.tutorialspoint.jpa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tutorialspoint.jpa.dao.EmployeeDAOImp;
import com.tutorialspoint.jpa.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp {

	
	private EmployeeDAOImp employeeDaoImp;

	public EmployeeDAOImp getEmployeeDaoImp() {
		return employeeDaoImp;
	}

	public void setEmployeeDaoImp(EmployeeDAOImp employeeDaoImp) {
		this.employeeDaoImp = employeeDaoImp;
	}

	@Transactional(rollbackFor=Exception.class)
	public void addEmployee(Employee employee) {
		employeeDaoImp.persistEmployee(employee);
	}

	@Transactional(readOnly = true)
	public List<Employee> loadEmployees() {
		return employeeDaoImp.loadEmployees();
	}

}
