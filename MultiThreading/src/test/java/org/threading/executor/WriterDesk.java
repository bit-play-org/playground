package org.threading.executor;

import java.util.concurrent.Callable;

public class WriterDesk implements Callable<Integer> {
	private String writerName;
	long bookSize;
	
	public WriterDesk(String writerName, long bookSize) {
		this.writerName = writerName;
		this.bookSize =  bookSize;
	}
	@Override
	public Integer call() throws Exception {
		System.out.println(writerName+" Occupied the seat and Started writing book of "+bookSize+" pages.");
		
		for(int i = 0;i < bookSize;i++) {
			try {
				Thread.sleep(100);
				System.out.println(writerName+" wrote, Page "+(i+1)+".");
			} catch (InterruptedException e) {
				e.printStackTrace();
				return 1;
			} catch (Exception e) {
				e.printStackTrace();
				return 1;
			}
		}
		return 0;
	}

}
