package com.core.test.utils.math;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.core.exceptions.math.IntegerBeyondLimitException;
import com.core.utils.math.BasicOperations;

@RunWith(Parameterized.class)
public class TestBasicOperations {

	BasicOperations basicOperations;
	int no1;
	int no2;
	int result;
	public TestBasicOperations(int no1, int no2, int result) {
		this.no1 = no1;
		this.no2 = no2;
		
		this.result = result;
	}
	
	@Parameterized.Parameters
	public static List createInputFeed() {
		return  Arrays.asList(new Object [] [] {
			{10, 20, 30}, 
			{50, 50, 100}, 
			{2147483000, 5000}, 
			{1, 2, 100}
		});
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("-------------------------------"
				+ "TEST STARTED"
				+ "-----------------------------------");
		basicOperations = new BasicOperations();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("=============================== "
				+ "TEST COMPLETED ===============================");
	}

	@Ignore
	@Test
	public void testAdd() {
		System.out.println("TEST : Not yet implemented");
		fail("Not yet implemented");
	}	
	
	@Test
	public void testAddWithArguments() throws IntegerBeyondLimitException {
		System.out.println("TEST : Test with values, POSITIVE");		
		assertEquals(result, basicOperations.add(no1, no2));
	}
	@Ignore
	@Test(expected=IntegerBeyondLimitException.class)
	public void testAddThrowException() throws IntegerBeyondLimitException {
		System.out.println("TEST : Test boundry condition");
		
		basicOperations.add(2147483000, 5000);
	}
	
	@Ignore
	@Test
	public void testAdditionPositive() {
		System.out.println("TEST : Test static method");
		//assertEquals(100, basicOperations.addition(50, 50));
		assertEquals(100, BasicOperations.addition(50, 50));
	}
}
