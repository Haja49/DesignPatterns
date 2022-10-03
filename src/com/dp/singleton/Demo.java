package com.dp.singleton;

public class Demo {
	
	/*
	 * Singleton Pattern (Creational Pattern):
	 * 	To ensure class has only one instance with global access.
	 * 
	 * Pros:
	 * 1. Good way to handle shared global resources with single instance.
	 * 2. Easy to implement.
	 * 
	 * Cons:
	 * 1. Violates Single responsibility principle --> as it solves 2 problems
	 * 		(one instance, global access).
	 * 2. Thread safety has to be ensured.
	 */

	
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		
		System.out.println(Singleton.getInstance());
	}
	
	/*
	 * Examples:
	 * 1. Runtime.getRuntime()
	 * 2. Desktop.getDesktop()
	 */
	
	public void example() {
		System.out.println(Runtime.getRuntime());
	}
}
