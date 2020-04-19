package com.j8.lambda;

public class NoArgNoReturnLambda {

	public static void main(String[] args) {

		// No Argument No Return
		IMath math=()->{
			System.out.println("This is Maths Class...");
			
		};
		
		math.greet();
		
		// Argument and return
		
		IAdd add = (a, b)->{
			
			if(a >=0 && b >= 0)
			{	return a+b;}
			else {
				return -1;
			}
		};
		
		System.out.println("Addition : "+add.add(10, 20));
		System.out.println("Addition : "+add.add(-10, 20));
		

	}

}
