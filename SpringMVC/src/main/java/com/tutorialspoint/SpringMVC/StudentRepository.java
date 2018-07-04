package com.tutorialspoint.SpringMVC;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	public Student findByName(String name);
	//public <student extends Student> student save(Student student);
	
}
