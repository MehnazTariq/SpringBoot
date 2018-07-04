package com.tutorialspoint.jpa.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.jpa.entity.Employee;
import com.tutorialspoint.jpa.service.EmployeeServiceImp;

public class SpringJPALocalMain {

	public static void main(String[] args) {
		//Container-Managed Entity Managers
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJPALocalConfigeration.xml");
		EmployeeServiceImp employeeServiceImp = context.getBean("employeeServiceImp", EmployeeServiceImp.class);

		//Employee employee = new Employee();
		//employee.setName("Shumaila");
		//employee.setSalary(80000);

		//employeeServiceImp.addEmployee(employee);
		List<Employee> lstEmp=employeeServiceImp.loadEmployees();

		lstEmp.forEach(emp -> System.out.println(emp));
		
		
		System.out.println("Employee created");


		List<Employee> lstEmployee=employeeServiceImp.loadEmployees();

		lstEmployee.forEach(emp -> System.out.println(emp));

		
		
		 //shut down the Spring context.
//		In non-web application, you need to shut down the Spring context manually, 
//		so that Ehcache got chance to shut down as well, otherwise Ehcache manager will hang there.


	    ((ConfigurableApplicationContext)context).close();

		
		
	}

}
