package com.j8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.core.subjects.Person;

public class ComparableLambda {
	private static List<Person> personList;
	public static List<Person> getPersonList(){
		if(personList == null) {
			personList = new ArrayList<Person>();			
		}
		
		personList.add(new Person("vaibhav" , "amravati", 34));
		personList.add(new Person("ravindra" , "tuljapur", 34));
		personList.add(new Person("devendra" , "patakheda", 33));
		personList.add(new Person("nagraj" , "solapur", 32));
		personList.add(new Person("prashant" , "sambhajinagar", 31));
		return personList;
	}
	public static void main(String[] args) {
		
		getPersonList();
		
		personList.forEach((person)->System.out.println(person));
		
		System.out.println("---------------------------");
		Collections.sort(personList, (p1, p2)->{
			return new Integer(p2.getAge()).compareTo(new Integer(p1.getAge()));
		});
		
		
		personList.forEach((person)->System.out.println(person));
	}

}
