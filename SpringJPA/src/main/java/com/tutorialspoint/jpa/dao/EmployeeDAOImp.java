package com.tutorialspoint.jpa.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutorialspoint.jpa.entity.Employee;

//@Repository for exception translation
@Repository
public class EmployeeDAOImp {

	// @Autowired
	private EntityManager entityManager;

	// @PersistenceContext for EntityManager injection
	@PersistenceContext(unitName = "HIBERNATE_JPA_JTA")

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Collection loadEmployeesSalary(float salary) {
		
		return entityManager.createQuery("from Employee e where e.salary = :salary").setParameter("salary", salary)
				.getResultList();
	}

	public List<Employee> loadEmployees() {
		return entityManager.createQuery("from Employee").getResultList();

	}


	
	public void persistEmployee(Employee employee) {

		entityManager.persist(employee);
	}

}
