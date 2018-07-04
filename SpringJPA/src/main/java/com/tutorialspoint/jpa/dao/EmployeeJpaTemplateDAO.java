package com.tutorialspoint.jpa.dao;


import java.util.List;
import javax.sql.DataSource;

import org.springframework.orm.jpa.JpaTemplate;

import com.tutorialspoint.jpa.entity.Employee;


public class EmployeeJpaTemplateDAO {

	private DataSource dataSource;
	private JpaTemplate jpaTemplate;  

	
	public JpaTemplate getJpaTemplate() {
		return jpaTemplate;
	}

	public void setJpaTemplate(JpaTemplate jpaTemplate) {
		this.jpaTemplate = jpaTemplate;
	}

	public void setTemplate(JpaTemplate template) {  
        this.jpaTemplate = template;  
    }  

	public void createEmployee(String name,float salary){  
		Employee employee = new Employee(name,salary);  
        jpaTemplate.persist(employee);  
    }  
    public void updateSalary(int id,float salary){  
    	Employee employee = jpaTemplate.find(Employee.class, id);  
        if(employee != null){  
        	employee.setSalary(salary);  
        }  
        //jpaTemplate.merge(account);  
    }  
    public void deleteEmployee(int id){  
    	Employee employee = jpaTemplate.find(Employee.class, id);  
        if(employee != null)  
        	jpaTemplate.remove(employee);  
    }  
    public List<Employee> getAllEmployee(){  
        List<Employee> employee =jpaTemplate.find("select emp from Employee emp");  
        return employee;  
    }  
    
      	
    }
	
	


