package com.core.threading;

public class Thread1 extends Thread{
	public Thread1() {
		
		System.out.println("Thread 1");
	}
	
	public Thread1(Runnable r) {
		super(r);
	}
	
	public void run() {
		System.out.println("Run Thread 1");
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 completed");*/
	}
}
