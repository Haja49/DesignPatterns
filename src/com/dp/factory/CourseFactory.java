package com.dp.factory;

public class CourseFactory {

	public static Course getCourse(String courseType) {
		switch (courseType) {
		case "HLD": {
			return new HLD();
		}
		case "LLD": {
			return new LLD();
		}
		default:
			return null;
		}
	}
}
