package com.dp.singleton;

public class Singleton {

	/*
	 * Eager Loading - initializes the object initialization when app is started
	 */
//	private static Singleton instance = new Singleton();
//	
//	private Singleton() {
//		
//	}
//	
//	public static Singleton getInstance() {
//		return instance;
//	}
	
	
	/*
	 * Lazy loading - initializes the object only when needed
	 */
//	private static Singleton instance = null;
//	
//	private Singleton() {
//		
//	}
//	
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance =  new Singleton();
//		}
//		return instance;
//	}
	
	
	/*
	 * To bring Thread safety in case of Reflection
	 * Volatile keyword (for variables) - even if value gets changed, can be accessed by 
	 * multiple threads
	 * 
	 * When to use it? You can use a volatile variable if you want to read and write long and double 
	 * variable automatically. It can be used as an alternative way of achieving synchronization in Java.
	 * All reader threads will see the updated value of the volatile variable after completing the 
	 * write operation.
	 */
	private static volatile Singleton instance = null;
	
	private Singleton() {
		if(instance != null) {
			throw new RuntimeException("Avoid Reflection");
		}
	}
	
//	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			instance =  new Singleton();
//		}
//		return instance;
//	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance =  new Singleton();
				}
			}
		}
		return instance;
	}
}
