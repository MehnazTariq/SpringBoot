package com.tutorialspoint.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tutorialspoint.jdbc.StudentJDBCTemplate;

public class JDBCMainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("JDBCConfig.xml");

		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		System.out.println("------Records Creation--------");
		studentJDBCTemplate.create("Zara", 11);
		studentJDBCTemplate.create("Nuha", 2);
		studentJDBCTemplate.create("Ayan", 15);

		System.out.println("------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();

		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}

		System.out.println("----Updating Record with ID = 2 -----");
		studentJDBCTemplate.update(2, 20);

		System.out.println("----Delete Record with ID = 1 -----");
		// studentJDBCTemplate.delete(1);

		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());

		StudentSimpleJdbcTemplate studentSimpleJdbc = (StudentSimpleJdbcTemplate) context
				.getBean("studentSimpleJdbcTemplate");
		System.out.println("------SQL Stored Procedure = Records Creation--------");
		Student student_pro = studentSimpleJdbc.getStudentById(2);
		System.out.print("ID : " + student_pro.getId());
		System.out.print(", Name : " + student_pro.getName());
		System.out.println(", Age : " + student_pro.getAge());

		System.out.println("----NamedParameterJdbcTemplate= Create Employee Record  -----");
		EmployeeDAO empDAO = (EmployeeDAO) context.getBean("employeeDAO");
		Employee emp = new Employee( "Waqar", 300);
		empDAO.save(emp);

	}
}
