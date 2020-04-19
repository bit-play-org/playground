package com.java.polymorph;

import com.java.exception.BikeNotFoundException;

public class Bike extends Vehicle{
	public String fuelType() throws BikeNotFoundException{
		return "Petrol";
	}
}
