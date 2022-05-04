package com.spring.annotations;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	@Bean(name="stu1")
	public Student getstudent() {
		Student obj = new Student();
		obj.setId(1);
		obj.setName("John");
		obj.setScore(100);
		return obj;
		
		
	}
	
	@Bean(name="col1")
	public College getCollege() {
		College col = new College();
		col.setCollege_id(101);
		col.setCollege_name("ABC");
		return col;
	}

}
