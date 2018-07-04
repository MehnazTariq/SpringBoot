package com.tutorialspoint.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.jpa.entity.Employee;


public class CreateEmployee {

   public static void main( String[ ] args ) {
   
	   
	   //Application-Managed Entity Managers 
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "HIBERNATE_JPA_LOCAL" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      Employee employee = new Employee( ); 
      employee.setName( "Gopal" );
      employee.setSalary( 40000 );
      
      
      entitymanager.persist( employee );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
}
