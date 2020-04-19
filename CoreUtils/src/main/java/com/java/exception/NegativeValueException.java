package com.java.exception;

import java.util.Arrays;

public class NegativeValueException extends Exception{

	private static final long serialVersionUID = 1L;
	private String code;
	private String errorFlow;
	
	public NegativeValueException(String code, String errorFlow) {
		super();
		this.code = code;
		this.errorFlow = errorFlow;
	}
	
	
}
