package org.wecancodeit.javacourses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
	
	private Map<String, Course> courses = new HashMap<String, Course>();
	
	public Map<String, Course> getCourses() {
		return courses;
	}
	
	
	public CourseRepository() {
		Course courseOne = new Course("spring", "Spring Framework", "Spring Frameword Description");
		Course courseTwo = new Course("java", "Core Java", "Core Java Description");
		Course courseThree = new Course("javascript", "JavaScript", "JavaScript Description");
		
		this.addCourse(courseOne);
		this.addCourse(courseTwo);
		this.addCourse(courseThree);
	}
	
	

	public void addCourse(Course course) {

		courses.put(course.getId(), course);
	}

}
