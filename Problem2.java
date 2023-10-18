package Week5;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Enter first integer number: ");
		int firstInt = calc.nextInt();
		
		System.out.println("Enter an arithmetic operator: ( + , - , * , / )");
		String operator = calc.next();
		
		System.out.println("Enter second integer number: ");
		int secondInt = calc.nextInt();
		
		if (operator.equals("+")) {
			int add;
			add = firstInt + secondInt;
			System.out.printf("The result of " + firstInt + " + " + secondInt + " = " + add);
		} else if(operator.equals("-")) {
			int sub;
			sub = firstInt - secondInt;
			System.out.printf("The result of " + firstInt + " - " + secondInt + " = " + sub);
		} else if(operator.equals("*")) {
			int mult;
			mult = firstInt * secondInt;
			System.out.printf("The result of " + firstInt + " * " + secondInt + " = " + mult);
		} else if(operator.equals("/")) {
			int divide;
			divide = firstInt / secondInt;
			System.out.printf("The result of " + firstInt + " / " + secondInt + " = " + divide);
		} else {
			System.out.printf("Error " + operator + " was not a valid operator.");
		}
		calc.close();
	}
}
