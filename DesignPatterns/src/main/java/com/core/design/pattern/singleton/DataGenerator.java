package com.core.design.pattern.singleton;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataGenerator implements Runnable{

	private String baseString;
	private int writeCount;
	final SimpleDateFormat YYYYMMDDHHMMSS_FORMAT = new SimpleDateFormat("yyyyMMdd_HHmmSS");
	
	public DataGenerator(String baseString, int writeCount) {
		this.baseString = baseString;
		this.writeCount = writeCount;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i< this.writeCount; i++){
				CentralDataWriter.getCentralFileWriter().write(YYYYMMDDHHMMSS_FORMAT.format(new Date())+"|"+baseString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	public String getBaseString() {
		return baseString;
	}
	public void setBaseString(String baseString) {
		this.baseString = baseString;
	}
}
