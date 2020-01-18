package com.core.design.pattern.singleton;

public class DataGeneratorMain {

	public static void main(String[] args) {
		DataGenerator d1 = new DataGenerator("Welcome to Java Threading", 100000);
		DataGenerator d2 = new DataGenerator("Hello Java Multithreading", 50000);
		DataGenerator d3 = new DataGenerator("Greeting to developers", 90000);
		DataGenerator d4 = new DataGenerator("Namaste Java", 120000);
		
		Thread t1= new Thread(d1);
		Thread t2= new Thread(d2);
		Thread t3= new Thread(d3);
		Thread t4= new Thread(d4);
		
		CentralDataWriter.initCentralWriterProperties("D:\\Vaibhav\\Developer\\data\\test\\file_1.dat");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
