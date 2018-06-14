package org.wecancodeit.javacourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class CourseController {
	
//	@RequestMapping("/courses")
//	public String courses(@RequestParam(name="name", required=false, defaultValue="Jeanne") String name, Model model) {
//		model.addAttribute("name", name);
//		return "courses";
//	}
	
	@Autowired
	CourseRepository courseRepo;

	@RequestMapping("/courses")
	public String getCourses() {
//		model.addAttribute("courses", courseRepo.getAllCourses());
		return "courses";
	}
	
	
	

}
