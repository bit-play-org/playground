package com.core.mettl;

public class ReturnBeforeStatement {

	public static void main(String[] args) {
		boolean t = true;
		
		System.out.println("Something");
		
		if(t) return;
		
		System.out.println("Out of the box");
		 
		int x = 0;
		
		/*if(x) {
			System.out.println("0");
		}else {
			System.out.println("non Zero");
		}*/
	}

}
