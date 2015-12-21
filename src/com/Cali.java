package com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Cali {
	
	@WebMethod
	public int addition(int p1, int p2){
		return p1 + p2;
	}
	@WebMethod
	public int subtraction(int p1, int p2){
		return p1 - p2;
	}
	@WebMethod
	public int multi(int p1, int p2){
		return p1 * p2;
	}
	@WebMethod
	public int division(int p1, int p2){
		return p1 / p2;
	}

}
