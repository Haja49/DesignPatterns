package com.dp.adaptor;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

	public List<Student> getStudentDetails() {
		List<Student> studentDetails = new ArrayList<>();
		
		CollegeStudent clgeStudent = new CollegeStudent("Haja", "J", "haja@gmail.com");
		
		SchoolStudent schlStudent = new SchoolStudent("Anand", "M", "anand@gmail.com");
		
		studentDetails.add(clgeStudent);
		studentDetails.add(new SchoolStudentAdaptor(schlStudent));
		
		return studentDetails;
	}
}
