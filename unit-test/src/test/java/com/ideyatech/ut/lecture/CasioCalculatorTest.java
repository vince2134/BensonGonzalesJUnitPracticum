package com.ideyatech.ut.lecture;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CasioCalculatorTest {
	private CasioCalculator casio; 
	
	@BeforeClass
	public static void initClass(){
		System.out.println("I WILL RUN ONCE!");
	}
	@Before
	public void init(){
		System.out.println("This will run BEFORE any unit test method!");
		casio = new CasioCalculator();
	}
	@Test
	public void testAdd(){
		long a =5;
		long b = 10;
		long result =casio.add(a, b);
		
		assertEquals("Sum should be 15",15l,result);
	}
	@Test
	public void testSubtract(){
		long a =10;
		long b = 5;
		long result =casio.subtract(a, b);
		
		assertEquals("Subtract should be 5",5l,result);
	}
	@Test
	public void testMultiply(){
		long a =10;
		long b = 5;
		long result =casio.multiply(a, b);
		
		assertEquals("Multiply should be 50",50l,result);
	}
	@Test
	public void testDivide(){
		double a =10;
		double b = 5;
		double result =casio.divide(a, b);
		
		assertEquals("Divide should be 2",2d,result,0);
	}	
	
	@Test
	public void testSqrt(){
		double a =4;
		double result =casio.sqrt(a);
		
		assertEquals("Square Root should be 2",2d,result,0);
	}
	@Test
	public void testPower(){
		double a =2;
		double b = 3;
		double result =casio.power(a, b);
		
		assertEquals("Power should be 8",8d,result,0);
	}
	@After
	public void cleanUp(){
		System.out.println("This will run AFTER any unit test method!");
	}	
	@AfterClass
	public static void afterClass(){
		System.out.println("I WILL RUN ONCE AFTER!");
	}
}
