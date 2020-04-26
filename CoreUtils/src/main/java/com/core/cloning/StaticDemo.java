package com.core.cloning;

public class StaticDemo {
	static {
		int x = 10;
	}
	static int x, y;
	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x+y + ++x);

	}

	
	public static void myMethod() {
		y = x++ + ++x;
		System.out.println(y);
	}
}
