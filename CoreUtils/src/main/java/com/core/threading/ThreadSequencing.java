package com.core.threading;

public class ThreadSequencing {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();/* {
			public void run() {
				System.out.println("Inside main");
			}
		};*/
		//Thread2 t2 = new Thread2();
		
		t1.start();
	
		
		Thread1 t2 = new Thread1(new RunnableEx());
		t2.start();
		
		
		/*t1.join();
		t2.start();*/
		
		
		

	}

}
