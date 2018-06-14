package org.wecancodeit.javacourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class CourseController {
	

	
	@Autowired
	CourseRepository courses;

	@RequestMapping("/courses")
	public String getCourses(Model model) {
		model.addAttribute("courses", courses.getCourses());
		return "courses";
	}
	
	
	

}
