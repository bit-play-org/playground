package com.core.mettl;

import java.math.BigDecimal;

public class ConvertFractions {

	public static void main(String[] args) {
		String n1 = "10.5";
		String n2 = "10";
		
		String a1 = String.valueOf(getAverage(n1, n2));
		System.out.println("a1 : "+a1);
		
		String a2 = String.valueOf(getAverageA(n1, n2));
		System.out.println("a1 : "+a2);
		
		String a3 = String.valueOf(getAverageB(n1, n2));
		System.out.println("a1 : "+a3);

	}
	
	public static BigDecimal getAverage(String b1, String b2) {
		BigDecimal bd1 = new BigDecimal(b1);
		BigDecimal bd2 = new BigDecimal(b2);
		
		return bd1.divide(bd2);
	}
	
	public static double getAverageA(String b1, String b2) {
		double bd1 = Double.valueOf(b1);
		double bd2 = Double.valueOf(b2);
		
		return bd1/bd2;
	}
	
	public static Float getAverageB(String b1, String b2) {
		float bd1 = Float.valueOf(b1);
		float bd2 = Float.valueOf(b2);
		
		return bd1/bd2;
	}

}
