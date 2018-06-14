package org.wecancodeit.javacourses;

public class Course {
	
	String id;
	String name;
	String description;
	
	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	

}
