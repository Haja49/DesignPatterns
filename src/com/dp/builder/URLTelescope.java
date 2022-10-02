package com.dp.builder;

public class URLTelescope {

	private String protocol;
	private String hostName;
	private String port;
	private String pathParam;
	private String queryParam;
	
	public URLTelescope() {
		
	}
	
	public URLTelescope(String protocol) {
		this.protocol = protocol;
	}
	
	public URLTelescope(String protocol, String hostName) {
		this(protocol);
		this.hostName = hostName;
	}
	
	public URLTelescope(String protocol, String hostName, String port, String pathParam, String queryParam) {
		this(protocol, hostName);
		this.port = port;
		this.pathParam = pathParam;
		this.queryParam = queryParam;
	}
}
