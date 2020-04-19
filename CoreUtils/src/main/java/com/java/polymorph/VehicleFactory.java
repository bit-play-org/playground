package com.java.polymorph;

public class VehicleFactory {
	public static void main(String [] args) {
		Vehicle car1 = new Car();
		//car1.fuelType();
		
		Car c1 = (Car)new Vehicle();
		c1.display();
	}
}
