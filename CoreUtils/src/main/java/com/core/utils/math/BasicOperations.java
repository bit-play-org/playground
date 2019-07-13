package com.core.utils.math;

import com.core.exceptions.math.IntegerBeyondLimitException;

public class BasicOperations {
	static final int MAX_INT= 2147483647;
	public int add(int no1, int no2) throws IntegerBeyondLimitException {
		System.out.println("No1 : "+no1+", No2 : "+no2);
		if((MAX_INT - no1) > no2) {
			return no1+no2;
		}else {			
			System.out.println("Addition response beyond integer limit");
			throw new IntegerBeyondLimitException(
					new Throwable("Addition response beyond integer limit"));
		}	
		
		
	
	}
}
