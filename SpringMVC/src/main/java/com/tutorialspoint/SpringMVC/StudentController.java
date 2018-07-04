package com.tutorialspoint.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	// @RequestMapping("/")
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "index";
	}

	// @PostMapping("/addStudent")
	@RequestMapping(method = RequestMethod.POST, value = "/addStudent")
	public String addStudent(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);

		student = studentService.addStudent(student);

		model.addAttribute("heading", "Student Saved");
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());

		return "student";
	}
}
