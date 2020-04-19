package com.playground.concurrency.subject;

import java.util.concurrent.Callable;

import com.playground.beans.Response;

public class ResponsiveWorker implements Callable<Response>{
	private int workLoad;
	private String workerName;	
	
	public ResponsiveWorker(int workLoad, String workerName) {
		super();
		this.workLoad = workLoad;
		this.workerName = workerName;
	}

	@Override
	public Response call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
