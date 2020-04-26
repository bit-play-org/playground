package com.core.looping;

import java.util.ArrayList;
import java.util.List;

public class ListSize {

	public static void main(String[] args) {
		
		System.out.println("Max Value : "+Integer.MAX_VALUE);
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i =0; i< Integer.MAX_VALUE; i++) 
			l1.add(0);
		l1.add(0);
		l1.add(1);
		System.out.println("size : "+l1.size());
		

	}

}
