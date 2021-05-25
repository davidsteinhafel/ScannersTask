package com.qa.scannerexample;




import com.qa.calculatorTask.Calculator;
import com.qa.calculatorTask.Menu;

public class ScannerExample {


	public static void main(String[] args) {
		try {
			Calculator.division(0,0);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("the try catch has finished");
		}
		
		Menu.userInterface();
		Menu.closeScanner();
	}
}