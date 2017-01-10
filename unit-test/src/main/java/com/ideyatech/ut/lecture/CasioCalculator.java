package com.ideyatech.ut.lecture;

import java.lang.Math.*;
public class CasioCalculator implements Calculator {
	
	private String model;
	public long add(long a, long b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public long subtract(long a, long b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public long multiply(long a, long b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public double sqrt(double a) {
		// TODO Auto-generated method stub
		return Math.sqrt(a);
	}

	public double power(double a, double pow) {
		// TODO Auto-generated method stub
		return Math.pow(a, pow);
	}

}
