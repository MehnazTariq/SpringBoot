package io.springbootquickstart.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springbootquickstart.domain.Course;
import io.springbootquickstart.domain.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	// private List<Topic> topics = new ArrayList<>(Arrays.asList(
	//
	// new Topic("spring", "Spring FrameWork", "Spring FrameWork Description"),
	// new Topic("java", "java FrameWork", "java FrameWork Description"),
	// new Topic("javaScript", "javaScript FrameWork", "javaScript FrameWork
	// Description"),
	// new Topic(".Net", "Net FrameWork", "Net FrameWork Description")));

	public List<Course> getAllCourses(String id) {

		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;

	}

	public Course getCourses(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

		return courseRepository.findOne(id);
	}

	public void addCourses(Course courses) {

		courseRepository.save(courses);
	}

	public void updateCourse(Course course) {
		// for (int i = 0; i < topics.size(); i++) {
		// Topic t = topics.get(i);
		// if (t.getId().equals(id)) {
		// topics.set(i, topic);
		// }
		// }

		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		courseRepository.delete(id);
	}

}
