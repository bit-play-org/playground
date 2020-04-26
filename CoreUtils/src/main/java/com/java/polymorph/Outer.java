package com.java.polymorph;

public class Outer {
	interface MemI{
		public void foo();
	}
	
	static class Inner implements MemI{

		@Override
		public void foo() {
			// TODO Auto-generated method stub
			System.out.println("Foo");
		}
		
	}
	
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner();
		in.foo();
	}
}
