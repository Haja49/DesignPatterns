package com.dp.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

	protected List<Module> modules = new ArrayList<>();
	
	public List<Module> getModules() {
		return modules;
	}

	public Course() {
		this.createCourse();
	}

	protected abstract void createCourse();
	
}
