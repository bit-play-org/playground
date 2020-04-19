package com.playground.concurrency.subject;

public class Worker implements Runnable{
	
	private String workerName;
	private int load;
	
	public Worker(String workerName, int load) {
		super();
		this.workerName = workerName;
		this.load = load;
	}

	@Override
	public void run() {
		System.out.println(this.workerName+" Started load.");
		try {
			Thread.sleep(load*(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.workerName+" Completed load.");
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}
}
