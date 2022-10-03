package com.dp.adaptor;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	/*
	 * 
	 * Adapter Pattern (Structural Pattern):
	 * 	To allows Objects with incompatible interfaces to collaborate.
	 * 
	 * Pros:
	 * 1. Easy to implement
	 * 2. Single Responsibility principle --> as interface can be separated from primary 
	 * 		business logic.
	 * 3. Open/ Closed Principle --> Multiple adaptors can be used.
	 * 
	 * Cons:
	 * 1. Complexity may increase as there might be a need to write more interfaces and classes.
	 * 
	 */

	public static void main(String[] args) {
		StudentDetails studentDetails = new StudentDetails();
		List<Student> students = studentDetails.getStudentDetails();
		System.out.println(students);
	}
	
	/*
	 * Examples:
	 * 1. Arrays.asList(array)
	 * 2. InputStreamReader(inputStream)
	 * 3. OutputStreamWriter(outputStream)
	 */
	
	public void example() {
		// Arrays.asList(array)
		String[] names = {"Haja", "Anand"};
		Arrays.asList(names);
	}
}
