package com;

import javax.xml.ws.Endpoint;

public class Service {
	
	

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/cali", new Cali());
		System.out.println("Service Created by Kim");
	}

}
