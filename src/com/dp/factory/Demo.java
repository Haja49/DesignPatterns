package com.dp.factory;

public class Demo {

	public static void main(String[] args) {
		Course hldCourses = CourseFactory.getCourse("HLD");
		Course lldCourses = CourseFactory.getCourse("LLD");
		
		assert hldCourses != null;
		System.out.println(hldCourses.modules);
		
		assert lldCourses != null;
		System.out.println(lldCourses.modules);
	}

}
