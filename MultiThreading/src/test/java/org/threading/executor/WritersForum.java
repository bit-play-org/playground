package org.threading.executor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class WritersForum {
	
	
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		String [] writersList = {"Vaibhav_10","Ravi_4","Nagraj_8","Rupesh_10", "Ganesh_2"
				, "Rajendra_4", "Prashant_11", "Devendra_2", "Akash_1", "Anurag_8"};
		List<Future<String>> results = null;
		for (String writer : writersList) {
			String writerName = writer.split("_")[0];
			long bookSize = Long.parseLong(writer.split("_")[1]);
			System.out.println(writerName+" is in queue.");
			//executor.execute(new WritingTask(writerName, bookSize));
			
			
			Future<String> result = executor.submit(new WritingTask(writerName, bookSize), 
					writerName+" Completed writing.");
				
			if(results == null) {
				results = new ArrayList<Future<String>>();				
			}
			results.add(result);
			
			
		}
		int responseCounter = results.size();
		while(responseCounter>0) {
			
			Iterator<Future<String>> resultIterator = results.listIterator();
			
			while(resultIterator.hasNext()) {
				
				Future<String> future = resultIterator.next();
				
				try {
					if(future.isDone()){
						responseCounter--;
						resultIterator.remove();						
						System.out.println("Response::> " + future.get());						
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			/*for (Future<String> future : results) {
				try {
					if(future.isDone()){
						responseCounter--;
						results.remove(future);
						System.out.println("Response::> " + future.get());
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		}
		
		
		executor.shutdown();
	}
}
