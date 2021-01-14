package Jan10Quiz;

import java.util.Scanner;

public class AdditionDivisionAndScanner {
	
	// creating a method to add two numbers 
	public void sum() { // begging of the sum Method
		/* 
		 * 1. Write a Java program to print the sum of two numbers. 
			  	Test Data:
			  	84 + 35
			  Expected Output : 119
		 */
		int num1 = 84;  // declare and assign an Integer variable which hold 84
		int num2 = 35;  // declare and assign an Integer variable which hold 35
		int sum = num1+num2; // // declare and assign an Integer variable sum which hold the addition of num1 and num2
		System.out.println("Expected Output :" + sum); // printing the out out in the consol 
	} // end of the sum method 

	public void division() {
		
		/*
		 2. Write a Java program to divide two numbers and print on the screen.
				Test Data :
				50/3
			Expected Output : 16
		 */
		int num1 = 50;
		int num2 = 3;
		int result = num1/num2;
		System.out.println("Expected Output :" + result);
		
	}
	
	public void scanner() {
		/*
		3. Write a Java program that takes two numbers as input and display the product of two numbers. 
				Test Data:
				Input first number: 25
				Input second number: 5
			Expected Output : 25 x 5 = 125
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		int firstNumber = input.nextInt();
		System.out.println("Input second number: ");
		int secondNumber = input.nextInt();
		int product = firstNumber*secondNumber;
		System.out.println("Expected Output : " +firstNumber + " X " +secondNumber + " = " + product);

		input.close();
		
		
		
	}
	
	public static void main(String[] args) {
		
		AdditionDivisionAndScanner obj = new AdditionDivisionAndScanner();
		obj.sum();
		obj.division();
		obj.scanner();

 
	}
}
