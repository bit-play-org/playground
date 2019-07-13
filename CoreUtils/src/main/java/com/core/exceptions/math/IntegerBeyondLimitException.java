package com.core.exceptions.math;

public class IntegerBeyondLimitException extends Exception{
	final String errorCode="ERROR_BEYOND_RANGE";
	
	public IntegerBeyondLimitException(Throwable throwable) {
		super(throwable);		
	}
	
	public String getErrorCode() {
		return errorCode;
	}
}
