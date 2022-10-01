package com.dp.factory;

import java.util.Calendar;

public class Demo {
	
	/*
	 * Factory Pattern (Creational Pattern):
	 * 1. Used for creation of Object that falls under same category but still with
	 * 		different properties.
	 * 2. Hides Complexity to user.
	 * 
	 * Pros:
	 * 1. Single Responsibility principle --> Product creation code can be kepy at one place making
	 * 		it easy to support.
	 * 2. Open/ Closed Principle --> New products can be added on need without breaking existing code.
	 * 
	 * Cons:
	 * 1. Comples coding as it cannot be refactored and takes time for set the base.
	 */

	public static void main(String[] args) {
		Course hldCourses = CourseFactory.getCourse("HLD");
		Course lldCourses = CourseFactory.getCourse("LLD");
		
		assert hldCourses != null;
		System.out.println(hldCourses.modules);
		
		assert lldCourses != null;
		System.out.println(lldCourses.modules);
	}

	/*
	 * Examples:
	 * 1. Calendar.getInstance()
	 * 2. NumberFormat.getInstance()
	 */
	public void example() {
		System.out.println(Calendar.getInstance());
	}
}
