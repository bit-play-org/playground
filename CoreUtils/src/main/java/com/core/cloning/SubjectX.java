package com.core.cloning;

public class SubjectX {
	int x;
	public SubjectX(int x ) {
		this.x = x;
		
		//return null;
	}
	
	public Object clone() {
		SubjectX x1 = new SubjectX(this.x);
		return x1;
	}
	
	@Override
	public String toString() {
		return ""+x;
	}
}
