package com.java.cmprtr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
	private static List<Student> students = null;
	
	static {
		loadStudents();
	}
	
	public static void main(String [] args) {
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("--------------------------------------------");
		Collections.sort(students, new MarksComparator());
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		
		
		
	}
	
	private static void loadStudents() {
		if(students == null) {
			students = new ArrayList<Student>();
		}
		
		students.add(new Student(1, "Vaibhav", 50));
		students.add(new Student(2, "Ravinda", 40));
		students.add(new Student(3, "Nagraj", 90));
		students.add(new Student(4, "Prashant", 80));
		students.add(new Student(5, "Hemant", 70));
		students.add(new Student(6, "Devendra", 76));
		
	}
	
}
