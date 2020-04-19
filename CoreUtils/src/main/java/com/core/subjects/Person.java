package com.core.subjects;

public class Person {
	private String personName;
	private String city;
	private int age;
	
	
	
	public Person(String personName, String city, int age) {
		super();
		this.personName = personName;
		this.city = city;
		this.age = age;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", city=" + city + ", age=" + age + "]";
	}
	
	
}
