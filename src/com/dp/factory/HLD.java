package com.dp.factory;

public class HLD extends Course{

	@Override
	public void createCourse() {
		modules.add(new DemoModule());
	}

}
