package com.playground.beans;

public class Response {
	private String responseString; 
	private int responseCode;
	
	public String getResponseString() {
		return responseString;
	}
	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	@Override
	public String toString() {
		return "Response [responseString=" + responseString + ", responseCode=" + responseCode + "]";
	}
	
	
}
