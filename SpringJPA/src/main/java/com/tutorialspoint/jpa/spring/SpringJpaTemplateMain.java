package com.tutorialspoint.jpa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.jpa.dao.EmployeeJpaTemplateDAO;

public class SpringJpaTemplateMain {

	public static void main(String[] args) {
	
		
		//Container-Managed Entity Managers 
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJPATemplateConfig.xml");  
		 EmployeeJpaTemplateDAO employeeJpaTempDAO = context.getBean("employeeJpaTemplateDAO",EmployeeJpaTemplateDAO.class);  
		          
		 employeeJpaTempDAO.createEmployee("Dawood", 1000);  
		 employeeJpaTempDAO.createEmployee("Gersi", 2000);  
		 System.out.println("Employee created");  

		
		

	}

}
