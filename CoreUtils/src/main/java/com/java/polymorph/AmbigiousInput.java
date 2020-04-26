package com.java.polymorph;

public class AmbigiousInput {
	public void display(Object i1) {
		System.out.println("Object : "+i1);
		
	}
	
	public void display(String s1) {
		System.out.println("String : "+s1);
	}
	
	public void display(StringBuffer s1) {
		System.out.println("StringBuffer : "+s1);
	}
	public static void main(String[] args) {

		//display(null);

	}

}
