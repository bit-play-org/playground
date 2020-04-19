package com.j8.lambda;

public class ThreadLambda {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Regular Runnable");	
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Regular Run Complete!!");
			}
		};
		
		Thread t1 =new Thread(r1);
		
		Runnable r2 = ()->{
			System.out.println("Inside Lambda Runnable....");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Lambda Run Complete");
		};
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		t1.yield();
		t2.start();
		
		
	}
}
