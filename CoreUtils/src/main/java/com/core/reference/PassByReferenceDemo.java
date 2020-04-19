package com.core.reference;

import com.core.subjects.Person;

public class PassByReferenceDemo {

	public static void main(String[] args) {
		
		PassByReferenceDemo passByReference = new PassByReferenceDemo();
		//Person person = new Person();
		
		/*passByReference.createPerson(person, "Vaibhav", "Amravati", 33);
		
		System.out.println("Person : "+person);*/
		
		
	}
	
	
	public void createPerson(Person person, String name, String city, int age) {
		person.setPersonName(name);
		person.setCity(city);
		person.setAge(age);
	}
	
	public void showPerson(Person person) {
		
	}
}
