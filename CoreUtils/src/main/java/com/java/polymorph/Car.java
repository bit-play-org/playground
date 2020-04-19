package com.java.polymorph;

import com.java.exception.CarNotFoundException;
import com.java.exception.NegativeValueException;
import com.java.exception.VehicleNotFoundException;

public class Car extends Vehicle{
	public String fuelType() throws CarNotFoundException,NegativeValueException{
		return "Diesel/Petrol";
	}
	
	public boolean hasAirBags() {
		return true;
	}
}
