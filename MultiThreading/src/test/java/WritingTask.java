import java.util.concurrent.TimeUnit;

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
				TimeUnit.SECONDS.sleep(5);
				System.out.println(writerName+" wrote, Page "+(i+1)+".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(writerName+"Finished writing");
		
	}

}
