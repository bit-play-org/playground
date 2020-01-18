package org.threading.executor;

public class WritingTask implements Runnable{

	private String writerName;
	long bookSize;
	
	public WritingTask(String writerName, long bookSize) {
		this.writerName = writerName;
		this.bookSize =  bookSize;
	}
	
	@Override
	public void run() {
		System.out.println(writerName+" Started writing book of "+bookSize+" pages.");
		
		for(int i = 0;i < bookSize;i++) {
			try {
				Thread.sleep(100);
				System.out.println(writerName+" wrote, Page "+(i+1)+".");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//System.out.println(writerName+"Finished writing, Ready for next task");
		
	}

}
