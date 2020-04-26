package com.core.mettl;

public class ThreadCaller {

	public static void main(String [] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.run();
		t2.run();
		
		t1.start();
		
		
		t1.start();
		
	}

}
