package com.j8.lambda;

public class GreetLambda {

	public static void main(String[] args) {
		
		IGreeting g1 = (person)->{
			System.out.println("Welocme "+person);
		};
		
		g1.greet("Vaibhav");
		
		g1.greet("Rita");

	}

}
