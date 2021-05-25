package com.qa.calculatorTask;

import java.util.Scanner;

public class Menu {
	public static Scanner scanner = new Scanner(System.in);

	public static void userInterface() {

		System.out.println(
				"Please choose which operation you want: Press 1 for - division, Press 2 for - multiplication, Press 3 for - subtraction, Press 4 to Exit");
		String input = scanner.nextLine().toString();

		switch (input) {
		case "1":
			System.out.println("division");
			System.out.println("Please input first number");
			double numOne = scanner.nextDouble();
			System.out.println("Please input second number");
			double numTwo = scanner.nextDouble();
			Calculator.division(numOne, numTwo);
			System.out.println("Would you like to do another operation (1 for yes, 2 for no)");
			scanner.nextLine();
			String again = scanner.nextLine();
			switch (again) {
			case "1":
				System.out.println("restarting...");
				userInterface();
				break;
			case "2":
				closeScanner();
				break;
			default:
				System.out.println("ummm?");
				closeScanner();
				break;
			}
			break;
		case "2":
			System.out.println("multiplication");
			System.out.println("Please input first number");
			numOne = scanner.nextDouble();
			System.out.println("Please input second number");
			numTwo = scanner.nextDouble();
			Calculator.multiplication(numOne, numTwo);
			System.out.println("Would you like to do another operation (1 for yes, 2 for no)");
			scanner.nextLine();
			again = scanner.nextLine();
			

			switch (again) {
			case "1":
				System.out.println("restarting...");
				userInterface();
				break;
			case "2":
				closeScanner();
				break;
			default:
				System.out.println("ummm?");
				closeScanner();
				break;
			}
			break;
		case "3":
			System.out.println("Subtraction");
			System.out.println("Please input first number");
			numOne = scanner.nextDouble();
			System.out.println("Please input second number");
			numTwo = scanner.nextDouble();
			Calculator.subtraction(numOne, numTwo);
			System.out.println("Would you like to do another operation (1 for yes, 2 for no)");
			scanner.nextLine();
			again = scanner.nextLine();

			switch (again) {
			case "1":
				System.out.println("restarting...");
				userInterface();
				break;
			case "2":
				closeScanner();
				break;
			default:
				System.out.println("ummm?");
				closeScanner();
				break;
			}
			break;
		case "4":
			closeScanner();
			break;
		default:
			System.out.println("Please press one of the specified numbers");
			userInterface();
			break;
		}
	}

	public static void closeScanner() {
		System.out.println("Bye Bye");
		System.out.println("Closing Scanner...");
		scanner.close();
		System.out.println("Scanner closed.");
	}

}
