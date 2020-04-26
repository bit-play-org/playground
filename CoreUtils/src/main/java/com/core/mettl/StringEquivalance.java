package com.core.mettl;

public class StringEquivalance {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = "test";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
