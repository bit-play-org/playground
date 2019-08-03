package com.core.design.pattern.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CentralDataWriter {
	private static File file;
	private static FileWriter fileWriter = null;
	private static CentralDataWriter centralDataWriter=null;
	private static String fileName;
	private CentralDataWriter() {}
	
	public static void initCentralWriterProperties(String fileName) {
		centralDataWriter.fileName = fileName;
	}
	
	private static void initCentralWriter() throws IOException {
		centralDataWriter = new CentralDataWriter();
		centralDataWriter.file = new File(centralDataWriter.fileName);
		try {
			centralDataWriter.fileWriter = new FileWriter(centralDataWriter.file, true);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public synchronized static CentralDataWriter getCentralFileWriter() throws IOException {
		
		if(centralDataWriter == null) {
			initCentralWriter();
		}
		
		return centralDataWriter;
	}
	
	public synchronized static void write(String record) throws IOException {
		try {
			centralDataWriter.fileWriter.write(record+"\n");
		} finally {
			centralDataWriter.fileWriter.flush();
		}
	}
	
	 
}
