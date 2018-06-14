package org.wecancodeit.javacourses;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CourseRepositoryTest {
	
	CourseRepository courseRepo = new CourseRepository();
	
	Course testCourse = new Course("spring", "Spring Framework", "Spring Frameword Description");
	
	@Test //passed
	public void addCourseShouldPassWhenAddedToMap() {
		
		int sizeBeforeNewCourse = courseRepo.getCourses().size();
		courseRepo.addCourse(testCourse);
		int sizeAfterNewCourse = courseRepo.getCourses().size();
		
		assertThat(sizeAfterNewCourse, equalTo(sizeBeforeNewCourse));
	}

}
