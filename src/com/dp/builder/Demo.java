package com.dp.builder;

public class Demo {
	
	/*
	 * Builder Pattern (Creational Pattern):
	 * 	To construct complex objects step by step.
	 * 
	 * Pros: 
	 * 1. Single Responsibility principle --> isolate complex construction code from business logic.
	 * 2. Approach is good to handle complexity.
	 * 3. Easy to implement.
	 * 4. Can be refactored.
	 * 
	 * Cons:
	 * 1. Number of lines of code will be huge.
	 * 2. Have to know the complete chain.
	 * 
	 */

	public static void main(String[] args) {
		URL url = new URL();
		url.setProtocol("https://");
		url.setHostName("mywebsite");
		url.setPort(":8080/");
		url.setPathParam("homepage");
		url.setQueryParam("random");
		
		System.out.print(url.getProtocol());
		System.out.print(url.getHostName());
		System.out.print(url.getPort());
		System.out.println(url.getPathParam());
		
		
		/*
		 * Builder inner static class implementation
		 * 
		 * External Class
		 */
		
		// Can access specific methods alone
		URLBuilder.URL url2 = new URLBuilder.URL();
		URLBuilder urlBuilder = url2.protocol("https://")
		.hostName("mywebsite")
		.port(":8080/").build();
		
		System.out.print(urlBuilder.protocol);
		System.out.print(urlBuilder.hostName);
		System.out.println(urlBuilder.port);
		
		// with additional builder method in parent class
//		new URLBuilder().builder().protocol("https://")
//		.hostName("mywebsite")
//		.port(":8080/").build();
//		
//		System.out.print(urlBuilder.protocol);
//		System.out.print(urlBuilder.hostName);
//		System.out.print(urlBuilder.port);
		
	}
	
	/*
	 * Examples:
	 * 1. StringBuilder.append()
	 * 2. StringBuffer.append()
	 * 3. Actions class in Selenium
	 */
	
	public void example() {
		StringBuilder sb = new StringBuilder();
		sb.append("abcd").append("efgh");
		
		System.out.println(sb.toString());
	}
}
