package com.playground.concurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.playground.concurrency.subject.*;

import com.playground.concurrency.subject.Worker;

public class FixedThreadPoolExecutorDemo {
	private static List<Worker> workerList;
	static {
		workerList = new ArrayList<Worker>();
		workerList.add(new Worker("Vaibhav",10));
		workerList.add(new Worker("Ganesh",2));
		workerList.add(new Worker("Nikhil",5));
		workerList.add(new Worker("Ajinkya",6));
		workerList.add(new Worker("Tinshuk",3));
		workerList.add(new Worker("Pawan",12));
		workerList.add(new Worker("Ashitosh",4));
		
	}
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for (Worker worker : workerList) {
			executorService.execute(worker);
		}
		
		/*while(executorService.awaitTermination(1, TimeUnit.MINUTES)) {
			
		}*/
		executorService.shutdown();
		
	}

}
