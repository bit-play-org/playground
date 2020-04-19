package com.java.polymorph;

import com.java.exception.NegativeValueException;

public class TestStaticBinding {

	public static void main(String[] args) {
	
		TestStaticBinding tsb1 = new TestStaticBinding();
		
		
		//System.out.println("10 + 20 = "+ tsb1.add(10, 20));
		System.out.println("10.5 + 20.5 = "+tsb1.add((float)10.5, (float)20.5));
		System.out.println("100.5 + 200.5 = "+tsb1.add(100.5, 200.5));

	}

	public int add(int no1, int no2) throws NegativeValueException{
		
		System.out.println("Integer Add");
		
		if(no1 < 0 || no2 < 0) {
			throw new NegativeValueException("NEG_INPUT", "Add Integer");
		}
		
		return no1 + no2;
	} 
	
	/*public float add(int no1, int no2) {
		return (float)(no1+no2)
	}*/
	
	public float add(float no1, float no2) {
		System.out.println("Float Add");
		return no1+no2;
	}
	
	public double add(double no1, double no2) {
		System.out.println("Double Add");
		return no1+no2;
	}
}
