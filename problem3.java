package week6;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
	
		Scanner numCheck = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String inputString = numCheck.next();
		
		int length = inputString.length();
		int count = 0;
		int total = 0;
		
		while (count < length) {
			char character = inputString.charAt(count);
			boolean number = Character.isDigit(character);
			
			if (number==true) {
				total += 1;
				break;
			}
			count += 1;
		}
		if (total >= 1) {
			System.out.println(inputString + " contains numerical characters, please check it again");
		}else {
			System.out.println(inputString + "does not contain numerical character");
		}
		numCheck.close();
	}
	
}			