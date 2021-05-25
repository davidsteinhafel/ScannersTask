package com.qa.calculatorTask;

public class Calculator {
	
	public static void multiplication(double x, double y) {

		double result;

		result = x * y;

		System.out.println("Your answer is: " + result);
	}

	public static void subtraction(double x, double y) {

		double result;

		result = x - y;

		System.out.println("Your answer is: " + result);
	}

	public static double division(double x, double y) {

		if (y > x) {

			System.out.println("Division cannot be performed!!!");

			return (0);

		} else {
			
			System.out.println("Your answer is: " + x / y);
			
			return x / y;

		}

	}

}
