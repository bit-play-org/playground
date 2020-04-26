package com.core.cloning;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InvokeSubjectX implements Serializable{
	private Tree tree = new Tree();
	public static void main(String[] args) {
		/*SubjectX x = new SubjectX(10);
		
		System.out.println(x.clone());*/
		
		
		/*String st1 = "onetwothree";
		byte[] bytes = st1.getBytes();
		InputStream stream = new ByteArrayInputStream(bytes);*/
		
		/*InvokeSubjectX s1 = new InvokeSubjectX();
		
		try {
			FileOutputStream out = new FileOutputStream("test.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			
			oout.writeObject(s1);
			oout.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}*/

	}

}

class Tree{}
