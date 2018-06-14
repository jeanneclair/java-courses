package org.wecancodeit.javacourses;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CourseController.class)

public class CourseControllerTest {

	@Resource
	MockMvc mvc;

	@MockBean
	CourseRepository courses;

	@Mock
	Course course;

	@Test
	public void getCoursesShouldReturnCoursesView() throws Exception {
		mvc.perform(get("/courses")).andExpect(view().name(is(equalTo("courses"))));
	}
	
	@Test
	public void getCoursesShouldBeSuccessful() throws Exception {
		mvc.perform(get("/courses")).andExpect(status().is2xxSuccessful());
	}

}
