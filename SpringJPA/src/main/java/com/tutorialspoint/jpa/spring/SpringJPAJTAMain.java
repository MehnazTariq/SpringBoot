package com.tutorialspoint.jpa.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.jpa.entity.Employee;
import com.tutorialspoint.jpa.service.EmployeeServiceImp;

public class SpringJPAJTAMain {

	public static void main(String[] args) {
		//Container-Managed Entity Managers
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJPAJTAConfigeration.xml");
		EmployeeServiceImp employeeServiceImp = context.getBean("employeeServiceImp", EmployeeServiceImp.class);

		Employee employee = new Employee();
		employee.setName("warda");
		employee.setSalary(20000);

		employeeServiceImp.addEmployee(employee);
		List<Employee> lstEmp=employeeServiceImp.loadEmployees();

		//lstEmp.forEach(emp -> System.out.println(emp));
		
		
		System.out.println("Employee created");

		
		
	}

}
