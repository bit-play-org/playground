package com.java.absrct;

public abstract class  Fruit {
	abstract void display();
	private void show() {
		System.out.println("Show Method");
	}
	
	private int maxValue = 100;
	
	public int getMaxValue() {
		return maxValue;
	}
	
	final void verbose() {
		
	}
	static void print() {
		System.out.println("Static Parent");
	}
}
