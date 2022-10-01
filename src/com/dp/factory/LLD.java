package com.dp.factory;

public class LLD extends Course{

	@Override
	public void createCourse() {
		modules.add(new ExerciseModule());
	}
}
