package com.java.polymorph;

import com.java.exception.BikeNotFoundException;
import com.java.exception.VehicleNotFoundException;

public class Vehicle {
	public String fuelType() throws VehicleNotFoundException, Exception{
		return "Petrol/Diesel/CNG/LPG";
	}
	
	public Vehicle display() {
		System.out.println("Vehicle Class");
		
		return null;
	}
}
