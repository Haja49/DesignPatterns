package com.dp.builder;

import java.util.function.Consumer;

public class URLBuilder {

	public static class URL {

		private String protocol;
		private String hostName;
		private String port;
		private String pathParam;
		private String queryParam;
		
		/*
		 * For builder method
		 */
//		private URL(String protocol, String hostName, String port) {
//			this.protocol = protocol;
//			this.hostName = hostName;
//			this.port = port;
//		}
		
//		public URLBuilder build() {
//			return new URLBuilder(protocol, hostName, port);
//		}
		
		public URLBuilder build() {
			return new URLBuilder(this);
		}
		
		public URL protocol(String protocol) {
			this.protocol = protocol;
			return this;
		}
		
		public URL hostName(String hostName) {
			this.hostName = hostName;
			return this;
		}
		
		public URL port(String port) {
			this.port = port;
			return this;
		}

	}
	
	public final String protocol;
	public final String hostName;
	public final String port;
	public final String pathParam;
	public final String queryParam;
	
	private URLBuilder(URL url) {
		this.protocol = url.protocol;
		this.hostName = url.hostName;
		this.port = url.port;
		this.pathParam = url.pathParam;
		this.queryParam = url.queryParam;
	}
	
	
	/*
	 * final variables can also be written as getter methods with constructor for Parent class
		accepting variables
		Lombak can be used with @Builder and @Getter annotation
	 * Optional builder which can also take a Consumer which needs setters
	 */
	
//	public URLBuilder() {
//		
//	}
//
//	public URLBuilder builder() {
//		return this;
//	}
//	
//	public URLBuilder builderWithConsumer(Consumer<URLBuilder> urlBuilder) {
//		urlBuilder.accept(this);
//		return this;
//	}
//	
//	public String protocol;
//	public URLBuilder setProtocol(String protocol) {
//		this.protocol = protocol;
//		return this;
//	}

}
