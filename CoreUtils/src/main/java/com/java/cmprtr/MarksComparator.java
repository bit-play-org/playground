package com.java.cmprtr;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		
		if(arg0.marks == arg1.marks) {
			return 0;
		}else if (arg0.marks > arg1.marks) {
			return 1;
		}else {
			return -1;
		}
	}

}
