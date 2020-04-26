package com.core.threading;

public class Thread2 extends Thread{
	public void run() {
		System.out.println("Thread 2");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 2 completed");
	}
}
