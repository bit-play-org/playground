package com.java.absrct;

public class Counter {
	static int cnt = 0;
	
	static public void showCounter() {
		System.out.println("Counter : "+cnt);
	}
	
	static public int increaseCounter() {
		return ++cnt;
	}
}
