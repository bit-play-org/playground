package com.java.absrct;

public class FruitMarket {

	public static void main(String[] args) {
		IFruit banana = new Banana();
		
		Banana b1 = new Banana();
		
		banana.show();
		IFruit.display();
		Banana.display();
		
		Counter counter = new Counter();
		counter.showCounter();
		
		System.out.println("Increase : "+counter.increaseCounter());
		
		Counter.increaseCounter();
		Counter.showCounter();
		
		
		Fruit mango = new Mango();
		Mango m1 = new Mango();
		mango.display();
		m1.print();
	}

}
