package com.java.exception;

public class VehicleNotFoundException extends Exception{
	public String exception_code;

	public VehicleNotFoundException(String exception_code) {
		super();
		this.exception_code = exception_code;
	}
	
}
