package io.springbootquickstart.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	
	//findBy+Entity+attribute
	public List<Course> findByTopicId(String topicId);
	
	
}
