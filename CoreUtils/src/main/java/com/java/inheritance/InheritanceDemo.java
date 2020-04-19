package com.java.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		Parent p1 = new Derrived();
		
		p1.display();
		p1.show();

		Derrived d1 = new Derrived();
		d1.display();
		d1.show();
		
		Derrived.display();
	}

}
